package Banco;

public class Conta {
	private int numeroConta;
	private int agencia;
	private double saldo;
	private Cliente titular;
	private static int totalDeContas;
	
	public Conta(int numeroConta, int agencia) {
		totalDeContas++;
		if(numeroConta <= 0 || agencia <= 0) {
			System.out.println("Agencia Não pode ser igual ou menor que zero");
			return;
		}else{
			this.agencia = agencia;
			this.numeroConta = numeroConta;
		}	
		this.titular = titular;
	}
	
	void deposita(double valor) {
		if(valor > 0.1) {
			this.saldo+=valor;
		}else {
			erroSaldo();
		}
	}
	
	boolean verificaSaldoNegativo(double valor){
		if(this.saldo < valor ) {
			System.out.println("Saldo insuficiente.");
			return false;
		}
			this.saldo += valor;
			return false;
	}
	
	boolean retiraDinheiro(double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		}
			return false;
	}

	boolean transfere(Conta destino, double valor) {
		if(verificaSaldoNegativo(valor)) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		System.err.println();
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	void erroSaldo() {
		System.out.println("A operação não foi realizada");
	}

	public void setTitutlar(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public int getAgencia() {
		return agencia;
	}
	
	public static int getTotalDeContas() {
		//como o atributo declarado na classe é static, o metodo tem que ser static tambmém pois só assim  
		//vai pegar a quantidade contas criadas no contexto geral.
		//dentro do contexto 'Static' não existe 'this', 
		return Conta.totalDeContas;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
