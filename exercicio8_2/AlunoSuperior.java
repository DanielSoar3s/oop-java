package exercicio8_2;

public class AlunoSuperior extends Alunos {
	private double mediaSemestral;
	private int peridoCursando;
	
	public AlunoSuperior(int matricula, String nome,String dataNascimento,double mediaSemestral, int periodoCursando) {
		super(matricula,nome,dataNascimento);
		this.mediaSemestral = mediaSemestral;
		this.peridoCursando = periodoCursando;
	}
	
	public String situacaoAprovacao(){
		double resultado = this.mediaSemestral;	
		if(resultado > 7) {
			return "AM";
		}
		else 
			if(resultado > 5 && resultado < 6.9){
				return "PF";
			}
		else {
			return "RE";
		}
	}
	
	public double getMediaSemestral() {
		return mediaSemestral;
	}

	public void setMediaSemestral(double mediaSemestral) {
		this.mediaSemestral = mediaSemestral;
	}

	public int getPeridoCursando() {
		return peridoCursando;
	}

	public void setPeridoCursando(int peridoCursando) {
		this.peridoCursando = peridoCursando;
	}

	public boolean isConcludente() {
		if(this.getPeridoCursando() == 6) {
			return true;
		}
		else {
			return false;
		}
	}
}