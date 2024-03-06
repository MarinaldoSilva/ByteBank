package Funcionario;

public class Gerente extends FuncionarioAutenticado{
	
	public Gerente(String nome, String cpf){
		super(nome, cpf);
	}
	
	private String senha;//como não definida a senha padrão é '0' zero;
	
	public double getBonificacao() {
		//recebe o salario como bonus + % de bonus padrão de funcionario
		return (super.getBonificacao()) + super.getSalario();
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean autenticar(String senha) {
		if(this.senha.equalsIgnoreCase(senha)) {
			System.out.println("Sistema liberado");
			return true;
		}else {
			System.out.println("acesso negado");
			return false;
		}
	}

	
}
