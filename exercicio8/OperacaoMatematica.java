package exercicio8;

public  abstract class OperacaoMatematica {
	
	private int numberA;
	private int numberB;
	
	public OperacaoMatematica(int numberA, int numberB) {
		this.numberA = numberA;
		this.numberB = numberB;
	}
	
	
	public int getNumberA() {
		return this.numberA;
	}
	
	public int getNumberB() {
		return this.numberB;
	}
	
	public void setNumberA(int numberA) {
		this.numberA = numberA;
	}
	
	public void setNumberB(int numberB) {
		this.numberB = numberB;
	}
	
	public abstract int realizarOperacao();  

}

	
	
	

