package exercicioSimulado;

public class Main {
	
	public static void main(String[] args) {
		Coisa coisa = new Coisa(2, 2);
		System.out.println(coisa);
		OutraCoisa coisa2 = new OutraCoisa(3, 2, 4, 2);
		System.out.println(coisa2);
		System.out.println(coisa2.metodoA());
		UmaCoisa coisa3 = new UmaCoisa(3, 4, 2);
		System.out.println(coisa3.metodoA());
		MaisUmaCoisa coisa4 = new MaisUmaCoisa(1, 1, 4);
		System.out.println(coisa4);
		System.out.println(coisa4.metodoA());
	}
}
