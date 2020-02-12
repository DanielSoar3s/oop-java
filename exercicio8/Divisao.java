package exercicio8;

public class Divisao extends OperacaoMatematica{

	public Divisao(int numberA,int numberB) {
		super(numberA,numberB);
	}
	
	
	public int realizarOperacao() {
		return this.getNumberA() / this.getNumberB();
	}
	
	
}
