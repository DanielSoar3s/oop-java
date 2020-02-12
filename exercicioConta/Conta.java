package exercicioConta;

public class Conta {
	private int numeroDaConta;
	private double saldo;
	private boolean atividade;
	
	public Conta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = 0;
		this.atividade = true;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		if( saldo > 0 ) {
			this.saldo = saldo;
		}
	}
	
	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}
	
	public void setNumeroDaConta(int numeroDaConta) {
		if(numeroDaConta > 0) {
			this.numeroDaConta = numeroDaConta;
		}
	}
	
	public boolean isAtividade() {
		return this.atividade;
	}
	
	public void setAtividade(boolean atividade) {
		this.atividade = atividade;
	}
	
	
	public String toString() {
		return 	"Numero da conta: " + this.numeroDaConta +"saldo: " + this.saldo + "atividade: " + this.atividade;
	}
	
	protected boolean isPossibleDebitar(double debitar) {
		if(debitar > 0 && debitar <= saldo) {
			return true;
		}
		else 
			return false;
	}
	
	protected boolean isPossibleCreditar(double valor) {
		if( valor > 0 ) {
			return true;
		}
		else
			return false;
	}
	
	protected void creditar(double valor) {
		if(isPossibleCreditar(valor)) {
			this.saldo = this.saldo + valor;
		}
		else {
		System.out.println("É impossivel creditar ");
		}
	}
		
	protected void debitar(double valor) {
		if(isPossibleDebitar(valor) == true) {
			this.saldo = this.saldo + valor;
		}
		else {
			System.out.println("Não é possivel");
		}
	}
	
	protected void transferir(Conta conta1, double valor) {
		 if(isPossibleCreditar(valor) && this.isPossibleDebitar(valor)) {
			 debitar(valor);
			 this.creditar(valor);
		 }
		 else {
			 System.out.println("saldo indisponivel");
		 }
		
		
	}
	
	
	
	
		
	
	
	

}
