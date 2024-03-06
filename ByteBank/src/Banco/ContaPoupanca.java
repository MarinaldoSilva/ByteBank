package Banco;

public class ContaPoupanca extends Conta {
	//construtor não é herdado, temos que inicializar o construtor da classe pai
	public ContaPoupanca(int numeroConta, int agencia) {
		//super chama o construtor especifico da classe mãe e a conta corrente 
		//vai ser obrigada a inicicalizae com numero da conta e agencia
		super(numeroConta, agencia);
		
	}
	
}
