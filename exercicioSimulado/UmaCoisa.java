package exercicioSimulado;

public class UmaCoisa extends Coisa {
	private int valor;
	
	public UmaCoisa(int x, int y, int valor) {
		super(x, y);
		this.valor = valor;
	}
	
	public double metodoA() {
		return 3.14 * Math.pow(valor, 2);
	}


	public void setValor(int valor) {
		if (valor >= 0) {
		this.valor = valor;
		}
	}
	
	public String toString() {
		return "\nCoisa" +
		super.toString() +
		"\nvalor: " + valor;
	}
	
	public int getValor() {
		return this.valor;
	}
	
}
