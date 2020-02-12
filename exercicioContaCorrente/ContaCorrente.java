package exercicioContaCorrente;

public class ContaCorrente {
	int numero;
	double saldo;
	
	ContaCorrente(int numero,double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	
	void debitar(double valor) {
		this.saldo = valor;
	}
	
	void creditar(double valor) {
		this.saldo += valor;
	}
	
}
