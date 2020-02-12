package exercicioCarro;

public class CarroCorrida {
	
	private int numeroCarro;
	private String piloto;
	private String equipe;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	private boolean ligado;
	
	
	
	public CarroCorrida(int numeroCarro,String piloto,String equipe,float velocidadeMaxima) {
		this.numeroCarro = numeroCarro;
		this.piloto = piloto;
		this.equipe = equipe;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
	public void setNumeroCarro (int valor) {
		this.numeroCarro = valor;
	}
	
	public void setPiloto(String nome) {
		this.piloto = nome;
	}
	
	public void setEquipe (String nome) {
		this.equipe = nome;
	}
	
	public void setVelocidadeMaxima (float velocidade) {
		this.velocidadeMaxima = velocidade;
	}
	
	public void setVelocidadeAtual (float velocidade) {
		this.velocidadeAtual = velocidade;
	}
	
	public void setLigado (boolean ligado) {
		this.ligado = ligado;
	}
	
	public int getNumeroCarro () {
		return this.numeroCarro;
	}
	
	public String getPiloto () {
		return this.piloto;
	}
	
	public String getEquipe () {
		return this.equipe;
	}
	
	public float getVelocidadeMaxima() {
		return this.velocidadeMaxima;
	}
	
	public float getVelocidadeAtual () {
		return this.velocidadeAtual;
	}
	
	public boolean isLigado () {
		return this.ligado;
	}
	
	public String toString () {
		return "Numero do carro " + this.numeroCarro + "Piloto: " + this.piloto + "Equipe: " + this.equipe + "Velocidade Maxima: " + this.velocidadeMaxima 
				+ "Velocidade Atual: " + this.velocidadeAtual + "ligado: " + this.ligado;
	}
	
	
	public void acelerar(float valor ) {
		if(this.ligado == true) {
			if(this.velocidadeAtual + valor <= this.velocidadeMaxima ) {
				this.velocidadeAtual += valor;
			}
		}
	}
	
	public void frear(float valor ) {
		if(this.ligado == true && this.velocidadeAtual > 0) {
			
			
		}
	}
	
	public void parar () {
		if(this.ligado == true ) {
			this.velocidadeAtual = 0;
		}
	}
	
	public void ligar () {
		if(this.ligado == false && this.velocidadeAtual == 0 ) {
			this.ligado = true;
		}
	}
	
	public void desligar () {
		if(this.ligado == true &&  this.velocidadeAtual == 0 ) { 
			this.velocidadeAtual = 0;
			this.ligado = false;
		}
	}
		
}
