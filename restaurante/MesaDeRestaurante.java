package restaurante;

public class MesaDeRestaurante {
	
	private int numeroMesa;
	private int quantidadePessoasSentadas;
	private double valorConta;
	
	
	public MesaDeRestaurante(int numeroMesa,int quantidadePessoasSentadas,double valorConta) {
		this.numeroMesa = numeroMesa;
		this.quantidadePessoasSentadas = quantidadePessoasSentadas;
		this.valorConta = valorConta;	
	}
	
	public int getNumeroMesa() {
		return this.numeroMesa;
	}
	
	public void setNumeroMesa(int numero) {
		this.numeroMesa = numero;
	}
	
	public int getQuantidadePessoasSentadas() {
		return this.quantidadePessoasSentadas;
	}
	
	public void setQuantidadePessoasSentadas(int quantidadePessoasSentadas) {
		this.quantidadePessoasSentadas = quantidadePessoasSentadas;
	}
	
	public double getValorConta() {
		return this.valorConta;
	}
	
	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}
	
	public double comissaoGarcom() {
		return this.valorConta = this.valorConta - (this.valorConta * 0.20);
	}
	
	public void acrescentarValorConta(double valor) {
		this.valorConta = valor;
	}
	
	
	
}
