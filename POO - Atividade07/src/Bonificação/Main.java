package Bonificação;

public class Main {
	public static void main(String[] args) {
		Cargo f1 = new Cargo("Carlos", 20, 1600.00, "Vendedor");
		f1.status();
		f1.Bonificacao();
		System.out.println("");
		
		Cargo f2 = new Cargo("Nataly", 19, 2000.00, "Supervisor");
		f2.status();
		f2.Bonificacao();
		System.out.println("");
		
		Cargo f3 = new Cargo("Henrique", 18, 2600.00, "Gerente");
		f3.status();
		f3.Bonificacao();
		System.out.println("");
	}
}