package rmi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.Cinema;
import model.Restaurante;
import model.Teatro;

public class RmiServer extends UnicastRemoteObject implements RmiFunctions {

	private static String pathRestaurante = "C:\\Users\\Vinicius\\git\\SD_PROJETO_FINAL\\SD_PROJETO_FINAL\\Restaurante.txt";
	private static String pathCinema = "C:\\Users\\Vinicius\\git\\SD_PROJETO_FINAL\\SD_PROJETO_FINAL\\Cinema.txt";
	private static String pathTeatro = "C:\\Users\\Vinicius\\git\\SD_PROJETO_FINAL\\SD_PROJETO_FINAL\\Teatro.txt";
	
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
		
		boolean reservaRealizada = false;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathRestaurante));

			try {
				String line = br.readLine();
				
				Restaurante restaurante = null;
				while (line != null) {
					String[] restaurantes = line.split(";");
					if(Integer.parseInt(restaurantes[0]) == idRestaurante){
						restaurante = new Restaurante(Integer.parseInt(restaurantes[0]), restaurantes[1], Integer.parseInt(restaurantes[2]));
						break;
					}else{
						line = br.readLine();
					}
				}
				
				if(restaurante != null && restaurante.getCapacidade() > qtdPessoas){
					reservaRealizada = true;
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return reservaRealizada;
	}

	@Override
	public boolean comprarIngressoCinema(int idCinema, int idFilme, int horario, int qtdIngressos) throws RemoteException {
		
		boolean compraRealizada = false;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathCinema));

			try {
				String line = br.readLine();
				
				Cinema cinema = null;
				while (line != null) {
					String[] cinemas = line.split(";");
					if(Integer.parseInt(cinemas[0]) == idCinema 
							&& Integer.parseInt(cinemas[2]) == idFilme
							&& Integer.parseInt(cinemas[4]) == horario){
						cinema = new Cinema(Integer.parseInt(cinemas[0]), cinemas[1], Integer.parseInt(cinemas[2]), cinemas[3], Integer.parseInt(cinemas[4]), Integer.parseInt(cinemas[5]));
						break;
					}else{
						line = br.readLine();
					}
				}
				
				if(cinema != null && cinema.getCapacidade() > qtdIngressos){
					compraRealizada = true;
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return compraRealizada;
	}

	@Override
	public boolean comprarIngressoTeatro(int idTeatro, int idPeca, int idHorario, int qtdIngressos) throws RemoteException {

		boolean compraRealizada = false;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(pathTeatro));

			try {
				String line = br.readLine();
				
				Teatro teatro = null;
				while (line != null) {
					String[] teatros = line.split(";");
					if(Integer.parseInt(teatros[0]) == idTeatro 
							&& Integer.parseInt(teatros[2]) == idPeca
							&& Integer.parseInt(teatros[4]) == idHorario){
						teatro = new Teatro(Integer.parseInt(teatros[0]), teatros[1], Integer.parseInt(teatros[2]), teatros[3], Integer.parseInt(teatros[4]), Integer.parseInt(teatros[5]));
						break;
					}else{
						line = br.readLine();
					}
				}
				
				if(teatro != null && teatro.getCapacidade() > qtdIngressos){
					compraRealizada = true;
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return compraRealizada;
	}

}
