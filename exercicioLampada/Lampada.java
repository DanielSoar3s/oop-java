package exercicioLampada;

public class Lampada {
	boolean ligada = false;
	
	Lampada(){
		
	}
	
	void ligarLampada() {
		this.ligada = true;
	}
	void desligarLampada() {
		this.ligada = false; 
	}
	void exibirEstado() {
		if(this.ligada == false) {
			System.out.println("Lampada est� desligada");
		}
		else {
			System.out.println("Lampada est� ligada");
		}
	}
	
	
}
