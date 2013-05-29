package rmi;

import java.rmi.*;

public interface RmiFunctions extends Remote {
	
   public boolean reservarRestaurante(int idRestaurante, int qtdPessoas) throws RemoteException;
   
   public boolean comprarIngressoCinema(int idCinema, int qtdIngressos, int idFilme) throws RemoteException;
   
   public boolean comprarIngressoTeatro(int idTeatro, int qtdIngressos, int idPeca) throws RemoteException;
   
}
