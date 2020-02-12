package exercicio8_2;

public class AlunoSubsequente extends Medio {
	
	private int quantidadeDisciplinasMatriculadas;
	
	public AlunoSubsequente(int matricula, String nome,String dataNascimento,double media1, double media2, int quantidadeDisciplinasMatriculadas) {
		super(matricula,nome,dataNascimento,media1,media2);
		this.quantidadeDisciplinasMatriculadas = quantidadeDisciplinasMatriculadas;
	}
	
	
	public void setQuantidadeDisciplinasMatriculadas(int quantidadeDisciplinasMatriculadas) {
		if(this.quantidadeDisciplinasMatriculadas > 6 ) {
			System.out.println("Não pode se matricular");
		}else {
			this.quantidadeDisciplinasMatriculadas = quantidadeDisciplinasMatriculadas;
		}
	}
	
	public int getQuantidadeDisciplinasMatriculadas() {
		return this.getQuantidadeDisciplinasMatriculadas();
	}
	
	
		
		
	
	
	
}
