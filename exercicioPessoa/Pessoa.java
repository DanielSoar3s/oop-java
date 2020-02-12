package exercicioPessoa;

public class Pessoa {

	String nome;
	int idade;
	
	
	
	public void fazAniversario() {
		int novaIdade = this.idade += 1;
		String nomePessoa = this.nome;
		System.out.println("Nome: " + nomePessoa + " Idade: " + novaIdade);
	}
	
	
	
	
	
	
}
