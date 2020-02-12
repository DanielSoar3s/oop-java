package tempo;

public class Tempo {
	
	private int hora;
	private int segundos;
	private int minutos;
	
	
	public Tempo(int hora, int segundos, int minutos) {
		this.hora = hora;
		this.segundos = segundos;
		this.minutos = minutos;
	}
	
	public Tempo(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = 0;
	}
	
	public Tempo(int hora) { 
		this.hora = hora;
		this.minutos = 0 ;
		this.segundos = 0;
	}
	
	public int getHora(){
		return this.hora;
	}
	
	public void setHora(int hora) {
		if( hora > 23) {
			System.out.println("Não pode inserir");
		}
		else {
			this.hora = hora;
		}
	}
	
	public int getMinutos() {
		return this.minutos;
	}
	
	public void setMinutos(int minutos) {
		if(minutos > 60) {
			System.out.println("Não pode inserir");
		}
		else {
			this.minutos = minutos;
		}
	}
	
	public void setSegundos(int segundos) {
		if(segundos > 60 ) {
			System.out.println("Não pode inserir");
		}
		else {
			this.segundos = segundos;
		}
	}
	
	public int getSegundos() {
		return this.segundos;
	}
	
	public void acertarTempo(int valor) {
		this.hora = valor;
	}
	
	public void acertarTempo(int valor,int minutos) {
		this.hora = valor;
		this.minutos = minutos;
	}
	
	public void acertarTempo(int valor,int minutos,int segundos) {
		this.hora = valor;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public void incrementarHora() {
		if(this.hora == 23 && this.hora > 23) {
			this.hora = 0;
		}
		else {
			this.hora = this.hora + 1;
		}
	}
	
	
	
	
}
