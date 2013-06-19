package ws;

import java.rmi.Naming;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import rmi.RmiFunctions;
import util.EnderecoIP;

import corba.Corba.CorbaFunctions;
import corba.Corba.CorbaFunctionsHelper;

@WebService
public class ServidorWeb {

	@WebMethod
	public String addRestaurante(short id, String nome, short capacidade) {

		String msg = "Restaurante n�o cadastrado";
		
		try {

			String[] args = new String[]{"-ORBInitialHost", EnderecoIP.IP.getIP()};
			
			// Cria e inicializa o ORB
			ORB orb = ORB.init(args, null);
			
			// Obtem referencia para o servico de nomes
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// Obtem referencia para o servidor
			String name = "CorbaFunctions";
			CorbaFunctions server = CorbaFunctionsHelper.narrow(ncRef.resolve_str(name));

			// Realiza o cadastro
			if(server.addRestaurante(id, nome, capacidade)){
				msg = "Restaurante cadastrado com sucesso";
			}

		} catch (InvalidName e) {
			e.printStackTrace();
		} catch (NotFound e) {
			e.printStackTrace();
		} catch (CannotProceed e) {
			e.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

		return msg;
	}

	@WebMethod
	public String addCinema(short id, String nome, short idFilme, String nomeFilme, short horario, short capacidade) {

		String msg = "Cinema n�o cadastrado";
		
		try {

			String[] args = new String[]{"-ORBInitialHost", EnderecoIP.IP.getIP()};
			
			// Cria e inicializa o ORB
			ORB orb = ORB.init(args, null);
			
			// Obtem referencia para o servico de nomes
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// Obtem referencia para o servidor
			String name = "CorbaFunctions";
			CorbaFunctions server = CorbaFunctionsHelper.narrow(ncRef.resolve_str(name));

			// Realiza o cadastro
			if(server.addCinema(id, nome, idFilme, nomeFilme, horario, capacidade)){
				msg = "Cinema cadastrado com sucesso";
			}

		} catch (InvalidName e) {
			e.printStackTrace();
		} catch (NotFound e) {
			e.printStackTrace();
		} catch (CannotProceed e) {
			e.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

		return msg;
	}

	@WebMethod
	public String addTeatro(short id, String nome, short idPeca, String nomePeca, short horario, short capacidade) {

		String msg = "Teatro n�o cadastrado";
		
		try {

			String[] args = new String[]{"-ORBInitialHost", EnderecoIP.IP.getIP()};
			
			// Cria e inicializa o ORB
			ORB orb = ORB.init(args, null);
			
			// Obtem referencia para o servico de nomes
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// Obtem referencia para o servidor
			String name = "CorbaFunctions";
			CorbaFunctions server = CorbaFunctionsHelper.narrow(ncRef.resolve_str(name));

			// Realiza o cadastro
			if(server.addTeatro(id, nome, idPeca, nomePeca, horario, capacidade)){
				msg = "Teatro cadastrado com sucesso";
			}

		} catch (InvalidName e) {
			e.printStackTrace();
		} catch (NotFound e) {
			e.printStackTrace();
		} catch (CannotProceed e) {
			e.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

		return msg;
	}

	@WebMethod
	public String recuperaRestaurante(short id) {

		String restaurante = "Restaurante n�o cadastrado";
		
		try {

			String[] args = new String[]{"-ORBInitialHost", EnderecoIP.IP.getIP()};
			
			// Cria e inicializa o ORB
			ORB orb = ORB.init(args, null);
			
			// Obtem referencia para o servico de nomes
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// Obtem referencia para o servidor
			String name = "CorbaFunctions";
			CorbaFunctions server = CorbaFunctionsHelper.narrow(ncRef.resolve_str(name));

			// Recupera o restaurante
			String restauranteStr = server.recuperaRestaurante(id);
			
			if(restauranteStr != null && !restauranteStr.isEmpty()){
				String[] restauranteSplit = restauranteStr.split(";");
				restaurante = "C�digo: "+restauranteSplit[0]+"\nNome: "+restauranteSplit[1] + "\nCapacidade: "+restauranteSplit[2];
			}
			
		} catch (InvalidName e) {
			e.printStackTrace();
		} catch (NotFound e) {
			e.printStackTrace();
		} catch (CannotProceed e) {
			e.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

		return restaurante;

	}

	@WebMethod
	public String recuperaCinema(short idCinema, short idFilme, short idHorario) {

		String cinema = "Cinema n�o cadastrado";
		
		try {

			String[] args = new String[]{"-ORBInitialHost", EnderecoIP.IP.getIP()};
			
			// Cria e inicializa o ORB
			ORB orb = ORB.init(args, null);
			
			// Obtem referencia para o servico de nomes
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// Obtem referencia para o servidor
			String name = "CorbaFunctions";
			CorbaFunctions server = CorbaFunctionsHelper.narrow(ncRef.resolve_str(name));

			// Recupera o restaurante
			String cinemaStr = server.recuperaCinema(idCinema, idFilme, idHorario);
			
			if(cinemaStr != null && !cinemaStr.isEmpty()){
				String[] cinemaSplit = cinemaStr.split(";");
				cinema = "C�digo: "+cinemaSplit[0]+"\nNome: "+cinemaSplit[1] + "\nC�digo do Filme: "+cinemaSplit[2]
						+"\nNome do Filme: "+cinemaSplit[3]+"\nHor�rio: "+cinemaSplit[4]+"\nCapacidade: "+cinemaSplit[5];
			}
			
		} catch (InvalidName e) {
			e.printStackTrace();
		} catch (NotFound e) {
			e.printStackTrace();
		} catch (CannotProceed e) {
			e.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

		return cinema;
	}

	@WebMethod
	public String recuperaTeatro(short idTeatro, short idPeca, short idHorario) {
		
		String teatro = "Teatro n�o cadastrado";
		
		try {
			String[] args = new String[]{"-ORBInitialHost", EnderecoIP.IP.getIP()};
			
			// Cria e inicializa o ORB
			ORB orb = ORB.init(args, null);
			
			// Obtem referencia para o servico de nomes
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// Obtem referencia para o servidor
			String name = "CorbaFunctions";
			CorbaFunctions server = CorbaFunctionsHelper.narrow(ncRef.resolve_str(name));

			// Recupera o restaurante
			String teatroStr = server.recuperaTeatro(idTeatro, idPeca, idHorario);
			
			if(teatroStr != null && !teatroStr.isEmpty()){
				String[] teatroSplit = teatroStr.split(";");
				teatro = "C�digo: "+teatroSplit[0]+"\nNome: "+teatroSplit[1] + "\nC�digo da Pe�a: "+teatroSplit[2]
						+"\nNome da Pe�a: "+teatroSplit[3]+"\nHor�rio: "+teatroSplit[4]+"\nCapacidade: "+teatroSplit[5];
			}
			
		} catch (InvalidName e) {
			e.printStackTrace();
		} catch (NotFound e) {
			e.printStackTrace();
		} catch (CannotProceed e) {
			e.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}

		return teatro;
	}

	@WebMethod
	public String reservarRestaurante(short idRestaurante, int qtdPessoas) {
		String msg = "Reserva de restaurante n�o realizada"; 
		
		try {
			RmiFunctions obj = (RmiFunctions)Naming.lookup("//"+EnderecoIP.IP.getIP()+"/RmiFunctions");
			
			if(obj.reservarRestaurante(idRestaurante, qtdPessoas)){
				msg = "Reserva de restaurante realizada";
			}
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return msg;
	}

	@WebMethod
	public String comprarIngressoCinema(short idCinema, short idFilme, short idHorario, int qtdIngressos) {
		String msg = "Compra de ingresso do cinema n�o realizada";
		
		try {
			RmiFunctions obj = (RmiFunctions)Naming.lookup("//"+EnderecoIP.IP.getIP()+"/RmiFunctions");
			
			if(obj.comprarIngressoCinema(idCinema, idFilme, idHorario, qtdIngressos)){
				msg = "Compra de ingresso do cinema realizada";
			}
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return msg;
	}

	@WebMethod
	public String comprarIngressoTeatro(short idTeatro, short idPeca, short idHorario, int qtdIngressos) {
		String msg = "Compra de ingresso do teatro n�o realizada";
		
		try {
			RmiFunctions obj = (RmiFunctions)Naming.lookup("//"+EnderecoIP.IP.getIP()+"/RmiFunctions");
			
			if(obj.comprarIngressoTeatro(idTeatro, idPeca, idHorario, qtdIngressos)){
				msg = "Compra de ingresso do teatro realizada";
			}
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return msg;
	}

}
