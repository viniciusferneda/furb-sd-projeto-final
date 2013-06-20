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

			System.out.println("Realizando cadastro do restaurante "+id);
			
			// Realiza o cadastro
			if(server.addRestaurante(id, nome, capacidade)){
				msg = "Restaurante cadastrado com sucesso";
				System.out.println("Restaurante "+id+" cadastrado com sucesso");
			}else{
				System.out.println("Restaurante "+id+" n�o cadastrado!");
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

			System.out.println("Realizando cadastro do cinema "+id+" filme "+idFilme+" horario "+horario);
			
			// Realiza o cadastro
			if(server.addCinema(id, nome, idFilme, nomeFilme, horario, capacidade)){
				msg = "Cinema cadastrado com sucesso";
				System.out.println("Realizado cadastro do cinema "+id+" filme "+idFilme+" horario "+horario);
			}else{
				System.out.println("N�o Realizado cadastro do cinema "+id+" filme "+idFilme+" horario "+horario);
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

			System.out.println("Realizando cadastro do teatro "+id+" pe�a "+idPeca+" horario "+horario);
			
			// Realiza o cadastro
			if(server.addTeatro(id, nome, idPeca, nomePeca, horario, capacidade)){
				msg = "Teatro cadastrado com sucesso";
				System.out.println("Realizado cadastro do teatro "+id+" pe�a "+idPeca+" horario "+horario);
			}else{
				System.out.println("N�o Realizado cadastro do teatro "+id+" pe�a "+idPeca+" horario "+horario);
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

			System.out.println("Recuperando restaurante "+id);
			
			// Recupera o restaurante
			String restauranteStr = server.recuperaRestaurante(id);
			
			if(restauranteStr != null && !restauranteStr.isEmpty()){
				String[] restauranteSplit = restauranteStr.split(";");
				restaurante = "C�digo: "+restauranteSplit[0]+"\nNome: "+restauranteSplit[1] + "\nCapacidade: "+restauranteSplit[2];
				System.out.println("Recuperado restaurante\n"+restaurante);
			}else{
				System.out.println("N�o Recuperado restaurante "+id);
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

			System.out.println("Recuperando cinema "+idCinema+" filme "+idFilme+" horario "+idHorario);
			
			// Recupera o restaurante
			String cinemaStr = server.recuperaCinema(idCinema, idFilme, idHorario);
			
			if(cinemaStr != null && !cinemaStr.isEmpty()){
				String[] cinemaSplit = cinemaStr.split(";");
				cinema = "C�digo: "+cinemaSplit[0]+"\nNome: "+cinemaSplit[1] + "\nC�digo do Filme: "+cinemaSplit[2]
						+"\nNome do Filme: "+cinemaSplit[3]+"\nHor�rio: "+cinemaSplit[4]+"\nCapacidade: "+cinemaSplit[5];
				System.out.println("Recuperado cinema\n"+cinema);
			}else{
				System.out.println("N�o Recuperado cinema "+idCinema+" filme "+idFilme+" horario "+idHorario);
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

			System.out.println("Recuperando teatro "+idTeatro+" pe�a "+idPeca+" horario "+idHorario);
			
			// Recupera o restaurante
			String teatroStr = server.recuperaTeatro(idTeatro, idPeca, idHorario);
			
			if(teatroStr != null && !teatroStr.isEmpty()){
				String[] teatroSplit = teatroStr.split(";");
				teatro = "C�digo: "+teatroSplit[0]+"\nNome: "+teatroSplit[1] + "\nC�digo da Pe�a: "+teatroSplit[2]
						+"\nNome da Pe�a: "+teatroSplit[3]+"\nHor�rio: "+teatroSplit[4]+"\nCapacidade: "+teatroSplit[5];
				System.out.println("Recuperado teatro\n"+teatro);
			}else{
				System.out.println("N�o Recuperado teatro "+idTeatro+" pe�a "+idPeca+" horario "+idHorario);
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
			
			System.out.println("Reservando restaurante "+idRestaurante+" para "+qtdPessoas+" pessoas");
			
			if(obj.reservarRestaurante(idRestaurante, qtdPessoas)){
				msg = "Reserva de restaurante realizada";
				System.out.println("Reserva realizada do restaurante "+idRestaurante+" para "+qtdPessoas+" pessoas");
			}else{
				System.out.println("Reserva n�o realizada do restaurante "+idRestaurante+" para "+qtdPessoas+" pessoas");
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
			
			System.out.println("Compra de ingresso do cinema "+idCinema+" filme "+idFilme+" horario "+idHorario+" para "+qtdIngressos+" pessoas");
			
			if(obj.comprarIngressoCinema(idCinema, idFilme, idHorario, qtdIngressos)){
				msg = "Compra de ingresso do cinema realizada";
				System.out.println("Realizada compra de ingresso do cinema "+idCinema+" filme "+idFilme+" horario "+idHorario+" para "+qtdIngressos+" pessoas");
			}else{
				System.out.println("N�o Realizada compra de ingresso do cinema "+idCinema+" filme "+idFilme+" horario "+idHorario+" para "+qtdIngressos+" pessoas");
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
			
			System.out.println("Compra de ingresso do teatro "+idTeatro+" peca "+idPeca+" horario "+idHorario+" para "+qtdIngressos+" pessoas");
			
			if(obj.comprarIngressoTeatro(idTeatro, idPeca, idHorario, qtdIngressos)){
				msg = "Compra de ingresso do teatro realizada";
				System.out.println("Realizada compra de ingresso do tearo "+idTeatro+" peca "+idPeca+" horario "+idHorario+" para "+qtdIngressos+" pessoas");
			}else{
				System.out.println("N�o realizada compra de ingresso do tearo "+idTeatro+" peca "+idPeca+" horario "+idHorario+" para "+qtdIngressos+" pessoas");
			}
		
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return msg;
	}

}
