package ws.client;

import javax.swing.JOptionPane;

public class WsClient {

	public static void main(String[] args) {
		  ServidorWeb port = new ServidorWebService().getServidorWebPort();
		  int acao;
		  do{
		   acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a ação que deseja realizar: " +
		       "\n 1 - Cadastrar \n 2 - Consultar \n 3 - Reservar \n 0 - Sair"));
		  
		  if(acao == 1){/**  */
		   System.out.println("---------------Corba-----------------");
		   int acao_cad = Integer.parseInt(JOptionPane.showInputDialog("Escolha o cadastro que deseja realizar: " +
		                "\n 1 - Cinema \n 2 - Restaurante \n 3 - Teatro"));
		   if(acao_cad == 1){
		      String c_id   = JOptionPane.showInputDialog("ID Cinema: ");

		      String c_nome   = JOptionPane.showInputDialog("Nome Cinema");

		      String c_id2   = JOptionPane.showInputDialog("ID Filme: ");

		      String c_nome2   = JOptionPane.showInputDialog("Nome Filme");

		      String c_id3   = JOptionPane.showInputDialog("Horário: ");

		      String c_cap   = JOptionPane.showInputDialog("Capacidade: ");

		    System.out.println(port.addCinema(Short.parseShort(c_id),c_nome, Short.parseShort(c_id2),c_nome2, Short.parseShort(c_id3), Short.parseShort(c_cap)));
		   }else if(acao_cad == 2){//OK

		      String r_id   = JOptionPane.showInputDialog("ID Restaurante: ");

		      String r_nome   = JOptionPane.showInputDialog("Nome Restaurante");

		      String r_cap   = JOptionPane.showInputDialog("Capacidade: ");

		    System.out.println(port.addRestaurante(Short.parseShort(r_id),r_nome, Short.parseShort(r_cap)));
		   }else if(acao_cad == 3){

		     String t_id   = JOptionPane.showInputDialog("ID Teatro: ");

		     String t_nome   = JOptionPane.showInputDialog("Nome Teatro");

		     String t_id2      = JOptionPane.showInputDialog("ID peça: ");

		     String t_nome2    = JOptionPane.showInputDialog("Nome peça");

		     String t_id3      = JOptionPane.showInputDialog("Horário?: ");

		     String t_cap   = JOptionPane.showInputDialog("Capacidade: ");

		    System.out.println(port.addTeatro(Short.parseShort(t_id),t_nome, Short.parseShort(t_id2),t_nome2, Short.parseShort(t_id3), Short.parseShort(t_cap)));
		   }
		   System.out.println("-------------------------------------");
		  }else if(acao == 2){
		   System.out.println("---------------WS+Corba----------------");
		   int acao_cons = Integer.parseInt(JOptionPane.showInputDialog("Escolha a consulta que deseja realizar: " +
		      "\n 1 - Cinema \n 2 - Restaurante \n 3 - Teatro"));
		   if(acao_cons == 1){

		      String c_busca_id1   = JOptionPane.showInputDialog("ID Cinema: ");

		      String c_busca_id2   = JOptionPane.showInputDialog("ID Filme: ");

		      String c_busca_id3   = JOptionPane.showInputDialog("ID Horário: ");

		    System.out.println(port.recuperaCinema(Short.parseShort(c_busca_id1), Short.parseShort(c_busca_id2), Short.parseShort(c_busca_id3)));
		   }else if(acao_cons == 2){

		      String r_busca_id1   = JOptionPane.showInputDialog("ID Restaurante: ");

		      System.out.println(port.recuperaRestaurante(Short.parseShort(r_busca_id1)));
		   }else if(acao_cons == 3){

		      String t_busca_id1   = JOptionPane.showInputDialog("ID Teatro: ");

		      String t_busca_id2   = JOptionPane.showInputDialog("ID Peça: ");

		      String t_busca_id3   = JOptionPane.showInputDialog("ID Horário: ");

		    System.out.println(port.recuperaTeatro(Short.parseShort(t_busca_id1), Short.parseShort(t_busca_id2), Short.parseShort(t_busca_id3)));
		   }
		   System.out.println("-------------------------------------");
		  }else if(acao == 3){
		   System.out.println("---------------WS+RMI+Corba----------------");
		   int acao_res = Integer.parseInt(JOptionPane.showInputDialog("Escolha a reserva/compra que deseja realizar: " +
		     "\n 1 - Cinema \n 2 - Restaurante \n 3 - Teatro"));
		   if(acao_res == 1){

		      String c_res_id1   = JOptionPane.showInputDialog("ID Cinema: ");

		      String c_res_id2   = JOptionPane.showInputDialog("ID Filme: ");

		      String c_res_id3   = JOptionPane.showInputDialog("Horário: ");

		      int c_res_qtd   = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Ingressos: "));

		    System.out.println(port.comprarIngressoCinema(Short.parseShort(c_res_id1),Short.parseShort(c_res_id2),Short.parseShort(c_res_id3),c_res_qtd));
		   }else if(acao_res == 2){

		      String r_res_id1   = JOptionPane.showInputDialog("ID Restaurante: ");

		      int r_res_qtd   = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Reservas: "));

		    System.out.println(port.reservarRestaurante(Short.parseShort(r_res_id1),r_res_qtd));
		   }else if(acao_res == 3){

		      String t_res_id1   = JOptionPane.showInputDialog("ID Teatro: ");

		      String t_res_id2   = JOptionPane.showInputDialog("ID Peça: ");

		      String t_res_id3   = JOptionPane.showInputDialog("ID Horário: ");

		      int t_res_qtd   = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Ingressos: "));

		    System.out.println(port.comprarIngressoTeatro(Short.parseShort(t_res_id1),Short.parseShort(t_res_id2),Short.parseShort(t_res_id3),t_res_qtd));
		   }
		   System.out.println("-------------------------------------");
		  }
		  }while(acao != 0);
	}
}


	

