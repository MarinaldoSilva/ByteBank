package Banco;

public class ContaCorrente extends Conta {
	//construtor não é herdado, temos que inicializar o construtor da classe pai
	public ContaCorrente(int numeroConta, int agencia) {
		//super chama o construtor especifico da classe mãe e a conta corrente 
		//vai ser obrigada a inicicalizae com numero da conta e agencia
		super(numeroConta, agencia);
		
	}

	
	@Override
	boolean sacar(double valor) {
		double valorSaque =0;
		if(super.getSaldo() >= valor) {
			valorSaque = valor + 6.50;
		}
		return super.sacar(valor);
	}
	
}
