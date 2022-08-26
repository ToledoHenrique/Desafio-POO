package Fila;

public class Main {
	public static void main(String[] args) {
		ListaPessoas l1 = new ListaPessoas();
		for (int n = 0; n <4; n++) {
			if (l1.idades[n] > l1.idade) {
				l1.idade = l1.idades[n];
				l1.nome = l1.nomes[n];
			}
		}
		System.out.println("Idade da pessoa mais velha dentro da lista: " + l1.idade);
		System.out.println("Nome da pessoa mais velha dentro da lista: " + l1.nome);
	}
}