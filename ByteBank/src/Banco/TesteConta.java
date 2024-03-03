package Banco;

public class TesteConta {
	public static void main(String[] args) {
		
		Cliente mario = new Cliente("Marinaldo","99999999999","cpd");
		Conta contaMario = new Conta(22758,2399);
		
		contaMario.setTitutlar(mario);
		System.out.println(contaMario.getTotalDeContas());
		System.out.println(contaMario.getTitular().getCpf());
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		Gerente teste = new Gerente("Mari","70099007444");
		teste.setSalario(5000);
		System.out.println(teste.getBonificacao());
		
	}
}
