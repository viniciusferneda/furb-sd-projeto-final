package rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.Cinema;
import model.Restaurante;
import model.Teatro;

import org.omg.CORBA.ORB;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import util.EnderecoIP;

import corba.Corba.CorbaFunctions;
import corba.Corba.CorbaFunctionsHelper;

public class RmiServer extends UnicastRemoteObject implements RmiFunctions {

	private static final long serialVersionUID = 1L;

	public RmiServer() throws RemoteException {
		super();
	}

	public static void main(String[] args) {
		try {
			RmiServer obj = new RmiServer();
			Naming.rebind("//localhost/RmiFunctions", obj);
			System.out.println("Servidor RMI aguardando requisicoes ....");
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
	}

	@Override
	public boolean reservarRestaurante(short idRestaurante, int qtdPessoas) throws RemoteException {
		
		boolean reservaRealizada = false;
		
		try {

			String[] args = new String[]{"-ORBInitialHost", EnderecoIP.LOCALHOST.getIP()};
			
			// Cria e inicializa o ORB
			ORB orb = ORB.init(args, null);
			
			// Obtem referencia para o servico de nomes
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

			// Obtem referencia para o servidor
			String name = "CorbaFunctions";
			CorbaFunctions server = CorbaFunctionsHelper.narrow(ncRef.resolve_str(name));

			// Recupera o restaurante
			String restauranteStr = server.recuperaRestaurante(idRestaurante);

			if(restauranteStr != null && !restauranteStr.isEmpty()){
				
				String[] restaurantes = restauranteStr.split(";");
				Restaurante restaurante = new Restaurante(Integer.parseInt(restaurantes[0]), restaurantes[1], Integer.parseInt(restaurantes[2]));
				
				if(restaurante != null && restaurante.getCapacidade() > qtdPessoas){
					reservaRealizada = true;
				}
			}
			
		} catch (InvalidName e) {
			e.printStackTrace();
		} catch (NotFound e) {
			e.printStackTrace();
		} catch (CannotProceed e) {
			e.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
			e.printStackTrace();
		}
		
		return reservaRealizada;
	}

	@Override
	public boolean comprarIngressoCinema(short idCinema, short idFilme, short idHorario, int qtdIngressos) throws RemoteException {
		
		boolean compraRealizada = false;
		
		try {

			String[] args = new String[]{"-ORBInitialHost", EnderecoIP.LOCALHOST.getIP()};
			
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
				
				String[] cinemas = cinemaStr.split(";");
				Cinema cinema = new Cinema(Integer.parseInt(cinemas[0]), cinemas[1], Integer.parseInt(cinemas[2]), cinemas[3], Integer.parseInt(cinemas[4]), Integer.parseInt(cinemas[5]));
				
				if(cinema != null && cinema.getCapacidade() > qtdIngressos){
					compraRealizada = true;
				}
			}
			
		} catch (InvalidName e) {
			e.printStackTrace();
		} catch (NotFound e) {
			e.printStackTrace();
		} catch (CannotProceed e) {
			e.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
			e.printStackTrace();
		}
		
		return compraRealizada;
	}

	@Override
	public boolean comprarIngressoTeatro(short idTeatro, short idPeca, short idHorario, int qtdIngressos) throws RemoteException {

		boolean compraRealizada = false;
		
		try {

			String[] args = new String[]{"-ORBInitialHost", EnderecoIP.LOCALHOST.getIP()};
			
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
				
				String[] teatros = teatroStr.split(";");
				Teatro teatro = new Teatro(Integer.parseInt(teatros[0]), teatros[1], Integer.parseInt(teatros[2]), teatros[3], Integer.parseInt(teatros[4]), Integer.parseInt(teatros[5]));
				
				if(teatro != null && teatro.getCapacidade() > qtdIngressos){
					compraRealizada = true;
				}
			}
			
		} catch (InvalidName e) {
			e.printStackTrace();
		} catch (NotFound e) {
			e.printStackTrace();
		} catch (CannotProceed e) {
			e.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
			e.printStackTrace();
		}
		
		return compraRealizada;
	}

}
