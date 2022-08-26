package Bonificação;

public class Cargo extends Funcionarios{
	public Cargo(String nome, int idade, double salario, String cargo) {
		super(nome, idade, salario, cargo);
	}
	
	public void status() {
		System.out.println("================ FUNCIONARIO ================");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade() + " anos");
		System.out.println("Salario: R$" + getSalario());
		System.out.println("Cargo: " + getCargo());
	}
	
	public void Bonificacao() {
		if (getCargo() == "Vendedor") {
			setSalario(getSalario() + 3000.00); 
			System.out.println("Bonificacao: R$" + getSalario());
			System.out.println("=============================================");
		} if (getCargo() == "Supervisor") {
			setSalario(getSalario() + 5000.00);
			System.out.println("Bonificacao: R$" + getSalario());
			System.out.println("=============================================");
		} if (getCargo() == "Gerente") {
			setSalario(getSalario() + 10000.00);
			System.out.println("Bonificacao: R$" + getSalario());
			System.out.println("=============================================");
		}
	}
}