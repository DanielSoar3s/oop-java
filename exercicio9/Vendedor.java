package exercicio9;

public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;
	public Vendedor(String nome, String endereco, String telefone, int codigoDoSetor, double salarioBase,
			double imposto,double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoDoSetor, salarioBase, imposto);
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		double resultado = super.getSalarioBase() + (this.getValorVendas() * this.getComissao());
		return resultado;
	}
	
	
	
	
	

	
}
