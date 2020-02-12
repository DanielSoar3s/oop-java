package exercicio8;

public class Subtracao extends OperacaoMatematica{

	
	public Subtracao(int numberA,int numberB) {
		super(numberA,numberB);
	}
	
	@Override
	public int realizarOperacao() {
		return this.getNumberA() - this.getNumberB();
	}
	
}
