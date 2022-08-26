package Main;

import java.util.ArrayList;
import java.util.List;
import Model.Livro;
import Model.Loja;
import Model.videoGame;

public class Main {
	public static void main(String[] args) {
		Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
		Livro l2 = new Livro("Senhor dos Aneis", 60, 30, "J. R. R. Tolkien", "fantasia", 500);
		Livro l3 = new Livro("JAVA - POO", 20, 50, "GFT", "educativo", 500);
		
		videoGame ps4 = new videoGame("PS4", 1800, 100, "SONY", "SLIM", false);
		videoGame ps4Usado = new videoGame("PS4", 1000, 7, "SONY", "SLIM", true);
		videoGame xbox = new videoGame("XBOX", 1500, 200, "MICROSOFT", "ONE", false);
		
		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		
		List<videoGame> videoGames = new ArrayList<>();
		videoGames.add(ps4);
		videoGames.add(ps4Usado);
		videoGames.add(xbox);
		
		Loja americanas = new Loja("Americanas", "12345678", livros, videoGames);
		l2.calculaImposto();
		l3.calculaImposto();
		System.out.println("===================================================");
		ps4Usado.calculaImposto();
		ps4.calculaImposto();
		System.out.println("===================================================");
		americanas.listaLivros();
		System.out.println("===================================================");
		americanas.listaVideoGames();
		System.out.println("===================================================");
		System.out.println(americanas.calculaPatrimonio());
	}
}