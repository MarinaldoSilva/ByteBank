package Banco;

import Cliente.Cliente;

public class TesteContasCC_e_CP {
	public static void main(String[] args) {
		
		Cliente mario = new Cliente("Marinaldo","99999999999","cpd");
		Cliente suene = new Cliente("Suene","564854321","ppe");
		
		ContaCorrente ccMario = new ContaCorrente(231, 16578);
		ContaPoupanca cpSuene = new ContaPoupanca(127, 21231);
		ccMario.setTitutlar(mario);
		cpSuene.setTitutlar(suene);
	
		ccMario.deposita(1000.00);
		ccMario.sacar(20);
		System.out.println("Mario " + ccMario.getSaldo());
		ccMario.transfere(cpSuene, 857.25);
		
		System.out.println("Mario " + ccMario.getSaldo());
		System.out.println("Suene " + cpSuene.getSaldo());
		
	}
}
