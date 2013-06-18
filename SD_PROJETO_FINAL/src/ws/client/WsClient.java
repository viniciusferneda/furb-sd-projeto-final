package ws.client;

public class WsClient {

	public static void main(String[] args) {
		
		ServidorWeb port = new ServidorWebService().getServidorWebPort();
		
		System.out.println(port.addRestaurante(Short.parseShort("1"), "Fulano", Short.parseShort("100")));
		System.out.println(port.addCinema(Short.parseShort("1"), "CineBlu", Short.parseShort("1"), "Os Fulanos", Short.parseShort("1"), Short.parseShort("100")));
		System.out.println(port.addTeatro(Short.parseShort("1"), "TeatroBlu", Short.parseShort("1"), "Os Beltranos", Short.parseShort("1"), Short.parseShort("50")));

		System.out.println(port.recuperaRestaurante(Short.parseShort("1")));
		System.out.println(port.recuperaCinema(Short.parseShort("1"), Short.parseShort("1"), Short.parseShort("1")));
		System.out.println(port.recuperaTeatro(Short.parseShort("1"), Short.parseShort("1"), Short.parseShort("1")));

		System.out.println(port.reservarRestaurante(Short.parseShort("1"),2));
		System.out.println(port.comprarIngressoCinema(Short.parseShort("1"),Short.parseShort("1"),Short.parseShort("1"),2));
		System.out.println(port.comprarIngressoTeatro(Short.parseShort("1"),Short.parseShort("1"),Short.parseShort("1"),2));
		
	}
	
}
