package Banco;

public class TesteConta {
	public static void main(String[] args) {
		
		Cliente mario = new Cliente("Marinaldo","99999999999","cpd");
		Conta contaMario = new Conta(22758,2399);
		
		contaMario.setTitutlar(mario);
		System.out.println(contaMario.getTotalDeContas());
		System.out.println(contaMario.getTitular().getCpf());
		
		
	}
}
