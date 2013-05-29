package rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RmiServer extends UnicastRemoteObject implements RmiFunctions {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RmiServer() throws RemoteException {
		super();
	}

	public static void main(String[] args) {
		try {
			RmiServer obj = new RmiServer();
			Naming.rebind("//localhost/RmiFunctions", obj);
		} catch (Exception ex) {
			System.out.println("Exception: " + ex.getMessage());
		}
	}

	@Override
	public boolean reservarRestaurante(int idRestaurante, int qtdPessoas) throws RemoteException {
		System.out.println("Executando reservarRestaurante(int idRestaurante, int qtdPessoas)");
		return true;
	}

	@Override
	public boolean comprarIngressoCinema(int idCinema, int qtdIngressos, int idFilme) throws RemoteException {
		System.out.println("Executando comprarIngressoCinema(int idCinema, int qtdIngressos, int idFilme)");
		return true;
	}

	@Override
	public boolean comprarIngressoTeatro(int idTeatro, int qtdIngressos, int idPeca) throws RemoteException {
		System.out.println("Executando comprarIngressoTeatro(int idTeatro, int qtdIngressos, int idPeca)");
		return true;
	}

}
