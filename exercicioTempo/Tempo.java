package exercicioTempo;

public class Tempo {


	private int hora;
	private int minutos;
	private int segundos;
	
    Tempo(){
		
	}
	
	public void setHora(int hora) {
		if(this.hora >= 0 && this.hora<= 23) {
		 this.hora=hora;
		}
	}
	public int getHora() {
		return this.minutos;
	}
	public void setMinutos(int minutos) {
		if(this.minutos >= 0 && this.minutos <= 60) {
		this.minutos = minutos;
		}
	}
	public int getMinutos() {
		return this.minutos;
	}
	public void setSegundos(int segundos) {
		if(this.segundos >= 0 && this.segundos <= 60) {
		this.segundos = segundos;
		}
	}
	int getSegundos() {
		return this.segundos;
	}
	
	public String toString() {
		return this.hora + ":" + this.minutos + ":" + this.segundos; 
	}
	
	public String getPeriodo() {
		if(hora > 6 && hora < 12) {
			return "manha";
		}
		else if( hora > 12 && hora < 18) {
			return "tarde";
		}
		else {
			return "noite";
		}
		
	}
	
	
}


