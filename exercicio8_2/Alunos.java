package exercicio8_2;

public abstract class Alunos {
	private int matricula;
	private String nome;
	private String dataNascimento;
	
	public Alunos(int matricula, String nome,String dataNascimento) {
		this.dataNascimento = dataNascimento;
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	public String getNome() {
		return this.nome;
	}
	public String getDataDeNascimento() {
		return this.dataNascimento;
	}
	public void setMatricula(int matricula) {
		this.matricula =  matricula;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public  void setDataDeNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	
	
	
}
