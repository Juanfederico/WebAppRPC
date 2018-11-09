package main;

import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

import consultasClub.FilialService;
import consultasClub.SocioService;
import handler.ConsultaHandler;
import handler.FilialHandler;
//import servicios.SocioService;

public class RPCServer {
	//public static ConsultaHandler handler = new ConsultaHandler();
	//public static SocioService.Processor<ConsultaHandler> processor = new SocioService.Processor<ConsultaHandler>(handler);
	//public static FilialHandler filialHandler = new FilialHandler();
	//public static FilialService.Processor<FilialHandler> processorFilial = new FilialService.Processor<FilialHandler>(filialHandler);
	private static TMultiplexedProcessor multiProcessor = new TMultiplexedProcessor();
	
	public static void main(String[] args) {
		multiProcessor.registerProcessor("SocioService", new SocioService.Processor<ConsultaHandler>(new ConsultaHandler()));
		multiProcessor.registerProcessor("FilialService", new FilialService.Processor<FilialHandler>(new FilialHandler()));
		Runnable simple = new Runnable() {
			public void run() {
				simple(multiProcessor);
			}
		}; 
	    
		new Thread(simple).start();
	}

	public static void simple(TMultiplexedProcessor processor) {
	    TServerTransport serverTransport;
		try {
			serverTransport = new TServerSocket(9091);
			TServer server = new TSimpleServer(new Args(serverTransport).processor(processor));
			
			System.out.println("Iniciando el servidor...");
			server.serve();
		} catch (TTransportException e) {
			e.printStackTrace();
		}
	  }
	
}
