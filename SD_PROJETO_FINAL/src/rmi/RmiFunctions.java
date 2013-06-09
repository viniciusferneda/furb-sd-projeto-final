package rmi;

import java.rmi.*;

public interface RmiFunctions extends Remote {
	
   public boolean reservarRestaurante(int idRestaurante, int qtdPessoas) throws RemoteException;
   
   public boolean comprarIngressoCinema(int idCinema, int idFilme, int horario, int qtdIngressos) throws RemoteException;
   
   public boolean comprarIngressoTeatro(int idTeatro, int idPeca, int idHorario, int qtdIngressos) throws RemoteException;
   
}
