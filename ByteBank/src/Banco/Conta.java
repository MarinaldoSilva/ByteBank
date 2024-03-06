package Banco;

import Cliente.Cliente;

public abstract class Conta {
	
	private int numeroConta;
	private int agencia;
	private double saldo;
	private Cliente titular;
	private static int totalDeContas;
	
	public Conta(int numeroConta, int agencia) {
		if(numeroConta >= 0 || agencia >= 0) {
			this.agencia = agencia;
			this.numeroConta = numeroConta;
			totalDeContas++;
		}else{
			System.out.println("Agencia Não pode ser igual ou menor que zero");
			return;
		}	
	}
	
	boolean deposita(double valor) {
		if(valor >= 0.1) {
			this.saldo += valor;
			return true;
		}else {
			erroSaldo();
			return false;
		}
	}

	boolean sacar(double valor) {
		if(this.saldo>=valor) {
			this.saldo -= valor;
			return true;
		}
			return false;
	}

	boolean transfere(Conta destino, double valor) {
		if(this.sacar(valor)) {
			destino.deposita(valor);
			return true;
		}else {
			erroSaldo();
			return false;
		}
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
