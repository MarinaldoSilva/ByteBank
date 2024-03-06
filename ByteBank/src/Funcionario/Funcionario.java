package Funcionario;

public abstract class Funcionario {
	//abstract é algo que não pode ser inicializado, tem que ser algo mais 
	//especifico, como gerente, adm e etc..
	private String nome;
	private String cpf;
	private double salario;
	
	Funcionario(String nome,String cpf){
		this.nome = nome; this.cpf = cpf;
	}
	
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
