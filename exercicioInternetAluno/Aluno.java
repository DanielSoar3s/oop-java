package exercicioInternetAluno;

public class Aluno {
	private String nome;
	private int nascimento;
	private int altura;
	
	
	
	public Aluno () {
		
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setNascimento(int dataNascimento) {
		this.nascimento = dataNascimento;
	}
	
	public void setAltura(int valor) {
		this.altura = valor;
	}
	
	public String getNome () {
		return nome;
	}
	
	public int getNascimento () {
		return nascimento;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public String toString () {
		return "Nome: " + this.nome + "Altura: " + this.altura + "Data de Nascimento: " + this.nascimento;
	}
}
