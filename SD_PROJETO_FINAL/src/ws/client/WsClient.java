package ws.client;

public class WsClient {

	public static void main(String[] args) {
		
		ServidorWeb port = new ServidorWebService().getServidorWebPort();
		
		System.out.println("---------------Corba-----------------");
		System.out.println(port.addRestaurante(Short.parseShort("1"), "Fulano", Short.parseShort("150")));
		System.out.println("\n");
		System.out.println(port.addCinema(Short.parseShort("1"), "CineBlu", Short.parseShort("1"), "Os Fulanos", Short.parseShort("1"), Short.parseShort("80")));
		System.out.println("\n");
		System.out.println(port.addTeatro(Short.parseShort("1"), "TeatroBlu", Short.parseShort("1"), "Os Beltranos", Short.parseShort("1"), Short.parseShort("40")));
		System.out.println("-------------------------------------");
		
		System.out.println("---------------WS+Corba----------------");
		System.out.println(port.recuperaRestaurante(Short.parseShort("1")));
		System.out.println("\n");
		System.out.println(port.recuperaCinema(Short.parseShort("1"), Short.parseShort("1"), Short.parseShort("1")));
		System.out.println("\n");
		System.out.println(port.recuperaTeatro(Short.parseShort("1"), Short.parseShort("1"), Short.parseShort("1")));
		System.out.println("-------------------------------------");
		
		System.out.println("---------------WS+RMI+Corba----------------");
		System.out.println(port.reservarRestaurante(Short.parseShort("1"),20));
		System.out.println("\n");
		System.out.println(port.comprarIngressoCinema(Short.parseShort("1"),Short.parseShort("1"),Short.parseShort("1"),75));
		System.out.println("\n");
		System.out.println(port.comprarIngressoTeatro(Short.parseShort("1"),Short.parseShort("1"),Short.parseShort("1"),5));
		System.out.println("-------------------------------------");

		System.out.println("---------------WS+Corba----------------");
		System.out.println(port.recuperaRestaurante(Short.parseShort("1")));
		System.out.println("\n");
		System.out.println(port.recuperaCinema(Short.parseShort("1"), Short.parseShort("1"), Short.parseShort("1")));
		System.out.println("\n");
		System.out.println(port.recuperaTeatro(Short.parseShort("1"), Short.parseShort("1"), Short.parseShort("1")));
		System.out.println("-------------------------------------");

	}
	
}
