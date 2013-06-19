package ws;

import javax.xml.ws.Endpoint;

import util.EnderecoIP;

public class ServidorMain {

	public static void main(String[] args){
		
		ServidorWeb service = new ServidorWeb();
		
		Endpoint.publish("http://"+EnderecoIP.LOCALHOST.getIP()+":8080/batatinha", service);
		
	}
	
}
