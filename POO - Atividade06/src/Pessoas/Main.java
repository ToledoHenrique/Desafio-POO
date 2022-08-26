package Pessoas;

public class Main {
	public static void main(String[] args) {
		Lista l1 = new Lista();
		int contador = 0;
		
		for (int n = 0; n < 2; n++) {
			if (l1.nomes[n] == "Jessica") {
				System.out.println("O nome Jessica foi encontrado dentro da lista, sua idade atual: " + l1.idade[contador]);
			} else {
				contador ++;
			}
		}
	}
}