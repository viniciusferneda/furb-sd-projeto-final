package rmi;

import java.rmi.*;

public interface RmiFunctions extends Remote {
	
   public boolean reservarRestaurante(short idRestaurante, int qtdPessoas) throws RemoteException;
   
   public boolean comprarIngressoCinema(short idCinema, short idFilme, short horario, int qtdIngressos) throws RemoteException;
   
   public boolean comprarIngressoTeatro(short idTeatro, short idPeca, short idHorario, int qtdIngressos) throws RemoteException;
   
}
