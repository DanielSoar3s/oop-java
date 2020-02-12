package exercicioSimulado;

public class MaisUmaCoisa extends UmaCoisa {
	public MaisUmaCoisa(int x, int y, int valor) {
		super(x, y, valor);
	}
	
	
	
	public double metodoA() {
		return getValor() * getValor();
	}
	
	
}
