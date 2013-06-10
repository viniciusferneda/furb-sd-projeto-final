package ws.client;

public class WsClient {

	public static void main(String[] args) {
		
		ServidorWeb port = new ServidorWebService().getServidorWebPort();
		
		System.out.println(port.reservarRestaurante(1,2));
		System.out.println(port.comprarIngressoCinema(1,1,1,2));
		System.out.println(port.comprarIngressoTeatro(1,1,1,2));
		
	}
	
}
