package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ServidorWeb {

	@WebMethod
	public String reservarRestaurante(int idRestaurante, int qtdPessoas) {
		return "Reserva de restaurante realizada";
	}
	
	@WebMethod
	public String comprarIngressoCinema(int idCinema, int idFilme, int horario, int qtdIngressos){
		return "Reserva de cinema realizada";
	}

	@WebMethod
	public String comprarIngressoTeatro(int idTeatro, int idPeca, int idHorario, int qtdIngressos){
		return "Reserva de teatro realizada";
	}
	
}
