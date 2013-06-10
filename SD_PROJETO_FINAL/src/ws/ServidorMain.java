package ws;

import javax.xml.ws.Endpoint;

public class ServidorMain {

	public static void main(String[] args){
		
		ServidorWeb service = new ServidorWeb();
		
		Endpoint endpoint = Endpoint.publish("http://localhost:8080/reservarRestaurante", service);
		
	}
	
}
