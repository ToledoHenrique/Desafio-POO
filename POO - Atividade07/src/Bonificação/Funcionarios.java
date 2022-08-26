package Bonificação;

public abstract class Funcionarios {
	private String nome;
	private int idade;
	private Double salario;
	private String cargo;
	
	public Funcionarios(String nome, int idade, double salario, String cargo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public abstract void Bonificacao();
}