package exercicio8_2;

public class Medio extends Alunos {

	private double media1;
	private double media2;
	
	public Medio(int matricula, String nome,String dataNascimento,double media1, double media2) {
		super(matricula,nome,dataNascimento);
		this.media1 = media1;
		this.media2 = media2;
	}
	
	public String resultadoFinal() {
		
		double resultado = (this.media1 + this.media2) / 2;
		if(resultado > 7 ) {
			return "AM";
		}
		else if(resultado > 5 && resultado <= 6.9) {
			return "PF";
		}
		else {
			return "RE";
		}
	}
	
	public double getMedia1() {
		return this.media1;
	}
	
	public double getMedia2() {
		return this.media2;
	}
	
	public void setMedia1(double media1) {
		this.media1 = media1;
	}
	
	public void setMedia2(double media2) {
		this.media2 = media2;
	}
	
}
