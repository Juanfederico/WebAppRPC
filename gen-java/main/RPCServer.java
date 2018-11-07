package main;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

import ejemplo.EjemploService;
import handler.EjemploHandler;
import servicios.FilialService;

public class RPCServer {
	public static EjemploHandler handler = new EjemploHandler();
	public static FilialService.Processor<EjemploHandler> processor = new FilialService.Processor<EjemploHandler>(handler);
	
	public static void main(String[] args) {
		Runnable simple = new Runnable() {
	        public void run() {
	          simple(processor);
	        }
	      };      
	     
	      new Thread(simple).start();
	}

	public static void simple(FilialService.Processor<EjemploHandler> processor) {
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
