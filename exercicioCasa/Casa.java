package exercicioCasa;

public class Casa {
	
	 String cor;
	 int porta1;
	 int porta2;
	 int porta3;
	 boolean aberta;
	 boolean fechada;
	
	
	public boolean abrir() {
		return this.aberta = true;
	}
	
	public boolean fechar() {
		return this.fechada = true;
	}
	
	public void pintar(String corEscolhida) {
		this.cor = corEscolhida;
		System.out.println("A casa foi pintada de: " + corEscolhida);
	}
	
	
}
