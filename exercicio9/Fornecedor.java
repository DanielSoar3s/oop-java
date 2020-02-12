package exercicio9;

public class Fornecedor extends Pessoa {
	private  double valorCredito,valorDivida;
	
	public Fornecedor(String nome,String endereco,String telefone,double valorCredito, double valorDivida) {
		super(nome,endereco,telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	@Override
	public String toString() {
		return "Fornecedor [valorCredito=" + valorCredito + ", valorDivida=" + valorDivida + " Nome: " + this.getNome() + " Endereço: " + this.getEndereco() + "Telefone: " + this.getTelefone() + " ]";
	}

	public double obterSaldo() {
		double resultado = this.getValorCredito() - this.getValorDivida(); 
		return resultado;
	}
	
	public double obterSaldo(double valor1, double valor2) {
		this.valorCredito = valor1;
		this.valorDivida = valor2;
		double resultadoOperacao = valor1 - valor2;
		return resultadoOperacao;
	}
	
}
