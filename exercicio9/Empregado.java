package exercicio9;

public class Empregado extends Pessoa{
	private int codigoDoSetor;
	private double salarioBase;
	private double imposto;
	
	
	
	public Empregado(String nome,String endereco,String telefone,int codigoDoSetor, double salarioBase, double imposto) {
		super(nome,endereco,telefone);
		this.codigoDoSetor = codigoDoSetor;
		this.imposto = imposto;
		this.salarioBase = salarioBase;
	}

	public int getCodigoDoSetor() {
		return codigoDoSetor;
	}

	public void setCodigoDoSetor(int codigoDoSetor) {
		this.codigoDoSetor = codigoDoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double calcularSalario() {
		return this.getSalarioBase();
	}

	@Override
	public String toString() {
		return "Empregado [codigoDoSetor=" + codigoDoSetor + ", salarioBase=" + salarioBase + ", imposto=" + imposto
				+ ", getCodigoDoSetor()=" + getCodigoDoSetor() + ", getSalarioBase()=" + getSalarioBase()
				+ ", getImposto()=" + getImposto() + ", calcularSalario()=" + calcularSalario() + "]";
	}
}
