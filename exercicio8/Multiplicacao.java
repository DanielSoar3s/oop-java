package exercicio8;

public class Multiplicacao extends OperacaoMatematica{

	public Multiplicacao(int numberA, int numberB) {
		super(numberA,numberB);
	}
	
	
	public int realizarOperacao() {
		return this.getNumberA() * this.getNumberB();
	}
}
