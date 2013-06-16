package rmi;

import java.rmi.Naming;

public class RmiClient {
	
   public static void main(String[] args) {
      
	   try {
		   
         RmiFunctions obj = (RmiFunctions)Naming.lookup("//localhost/RmiFunctions");
         
         boolean reservaRestaurante = obj.reservarRestaurante(Short.parseShort("1"), 2);
         boolean compraIngressoCinema = obj.comprarIngressoCinema(Short.parseShort("1"), Short.parseShort("1"), Short.parseShort("1"), 2);
         boolean compraIngressoTeatro = obj.comprarIngressoTeatro(Short.parseShort("1"), Short.parseShort("1"), Short.parseShort("1"), 2);
         
         System.out.println("Mensagem do Servidor: " + (reservaRestaurante ? "Reserva de restaurante realizada" : "Reserva de restaurante não realizada"));
         
         System.out.println("Mensagem do Servidor: " + (compraIngressoCinema ? "Compra de ingresso do cinema realizada" : "Compra de ingresso do cinema não realizada"));
         
         System.out.println("Mensagem do Servidor: " + (compraIngressoTeatro ? "Compra de ingresso do teatro realizada" : "Compra de ingresso do teatro não realizada"));
         
      } catch (Exception ex) {
    	  
         System.out.println("Exception: " + ex.getMessage());
         
      }
	   
   }
   
}
