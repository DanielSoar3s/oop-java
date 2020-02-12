package exercicioCaelum;

public class CaelumTeste {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.nome = "Daniel";
		c1.saldo = 100;
		
		c2.nome = "Daniel";
		c2.saldo = 100;
		

	     if (c1 == c2) {
	         System.out.println("iguais");
	     } else {
	         System.out.println("diferentes");        
	     }
		
		
		
		
		
	}		
	
	
}
