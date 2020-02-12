package exercicio8;

public class Soma extends OperacaoMatematica {
	
	public Soma(int numberA, int numberB) {
		super(numberA,numberB);
	}
	
	public int realizarOperacao() {	
		return this.getNumberA() + getNumberB();
	}
	
	
}
