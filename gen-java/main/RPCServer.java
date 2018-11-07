package main;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

import handler.ConsultaHandler;
import consultasClub.FilialService;
import consultasClub.CanchaService;
import consultasClub.SocioService;
import consultasClub.TurnoService;
//import servicios.SocioService;

public class RPCServer {
	public static ConsultaHandler handler = new ConsultaHandler();
	public static SocioService.Processor<ConsultaHandler> processor = new SocioService.Processor<ConsultaHandler>(handler);
	
	public static void main(String[] args) {
		Runnable simple = new Runnable() {
	        public void run() {
	          simple(processor);
	        }
	      };      
	     
	      new Thread(simple).start();
	}

	public static void simple(SocioService.Processor<ConsultaHandler> processor) {
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
