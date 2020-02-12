package exercicio8;

public class Main {

	
	public static void main(String[] args) {
		
		Soma soma = new Soma(2,2);

		int soma1 = soma.realizarOperacao();
		System.out.println(soma1);
		
		Multiplicacao mult = new Multiplicacao(2,3);
		System.out.println(mult.realizarOperacao());
		
		
		Subtracao sub = new Subtracao(10, 5);
		int resultado = sub.realizarOperacao();
		System.out.println(resultado);
		
		
		
		Divisao div = new Divisao(10,5);
		int resultado2 = div.realizarOperacao();
		System.out.println(resultado2);
	}
	
}
