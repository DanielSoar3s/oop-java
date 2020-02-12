package exercicio9;

public class Operario extends Empregado{

	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String telefone, int codigoDoSetor, double salarioBase,
			double imposto,double valorProducao,double comissao) {
		super(nome, endereco, telefone, codigoDoSetor, salarioBase, imposto);
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return super.getSalarioBase() + (this.getValorProducao() * this.getComissao());
	}
	
	
	
	
}
