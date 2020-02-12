package exercicioCaelum;

public class Conta {
	
	String nome;
	int numero;
	String agencia;
	double saldo;
	String dataAbertura;
	
	Conta() {
		
	}
	
	public void sacar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public double calcularRendimento() {
		return this.saldo *  0.1;
	}
	
	public void recuperaDadosParaImpressao() {
		System.out.println("Nome: " + this.nome + "numero: " + this.numero + "agencia: "+ this.agencia + "saldo: " + this.saldo + " dataAbertura: " + this.dataAbertura);;
	}
	
	
	
}
