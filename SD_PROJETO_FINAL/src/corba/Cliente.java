package corba;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import corba.Corba.CorbaFunctions;
import corba.Corba.CorbaFunctionsHelper;

public class Cliente {

	public static void main(String args[]) {

		try {

			// Cria e inicializa o ORB
			ORB orb = ORB.init(args, null);

			// Obtem referencia para o servico de nomes
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// Obtem referencia para o servidor
			String name = "CorbaFunctions";
			CorbaFunctions server = CorbaFunctionsHelper.narrow(ncRef.resolve_str(name));

			// Imprime mensagem de boas-vindas
			System.out.println(server.addRestaurante(Short.parseShort("1"), "LALA", Short.parseShort("100")));
			System.out.println(server.addCinema(Short.parseShort("1"), "TRALALA", Short.parseShort("1"), "ZECAS", Short.parseShort("1"), Short.parseShort("80")));
			System.out.println(server.addTeatro(Short.parseShort("1"), "TROLALA", Short.parseShort("1"), "JUCAS", Short.parseShort("1"), Short.parseShort("50")));

			System.out.println(server.recuperaRestaurante(Short.parseShort("1")));
			System.out.println(server.recuperaCinema(Short.parseShort("1"), Short.parseShort("1"), Short.parseShort("1")));
			System.out.println(server.recuperaTeatro(Short.parseShort("1"), Short.parseShort("1"), Short.parseShort("1")));
			
		} catch (Exception e) {
			System.out.println("ERROR : " + e);
			e.printStackTrace(System.out);
		}

	}

}
