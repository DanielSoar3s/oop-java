package exercicio9;

public class Administrador extends Empregado {
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, String telefone, int codigoDoSetor, double salarioBase,
			double imposto,double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoDoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public double calcularSalario() {
		return super.getSalarioBase() + this.getAjudaDeCusto();
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public String toString() {
		return "Administrador [ajudaDeCusto=" + ajudaDeCusto + ", calcularSalario()=" + calcularSalario()
				+ ", getAjudaDeCusto()=" + getAjudaDeCusto() + ", getCodigoDoSetor()=" + getCodigoDoSetor()
				+ ", getSalarioBase()=" + getSalarioBase() + ", getImposto()=" + getImposto() + ", toString()="
				+ super.toString() + ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco()
				+ ", getTelefone()=" + getTelefone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
