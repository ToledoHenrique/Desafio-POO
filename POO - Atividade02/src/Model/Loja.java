package Model;

import java.util.List;

public class Loja {
	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<videoGame> videoGame;
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<videoGame> videoGame) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGame = videoGame;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<videoGame> getVideoGame() {
		return videoGame;
	}
	public void setVideoGame(List<videoGame> videoGame) {
		this.videoGame = videoGame;
	}
	
	public void listaLivros() {
		System.out.println("A loja Americanas possue os seguintes Livros para venda: ");
		for (int i = 0; i < livros.size(); i++) {
		if (livros.size() != 0) {
			System.out.println("Livro: " + livros.get(i).getNome() + ", preco: " + livros.get(i).getNome() + ", quantidade: " + livros.get(i).getQtd() + " em estoque.");
		} else {
			System.out.println("A loja nao possue este livro em estoque.");
			}
		}
	}
	
	public void listaVideoGames() {
		System.out.println("A loja Americanas possue os seguintes Consoles para venda: ");
		for (int i = 0; i < videoGame.size(); i++) {
		if (videoGame.size() != 0) {
			System.out.println("Console: " + videoGame.get(i).getNome() + ", Modelo: " + videoGame.get(i).getModelo() + ", preco: " + videoGame.get(i).getPreco() + ", quantidade: " + videoGame.get(i).getQtd() + " em estoque.");
		} else {
			System.out.println("A loja nao possue este console em estoque.");
			}
		}
	}
	
	public double calculaPatrimonio() {
		double multiVideoGame = 0;
		for (int i = 0; i < videoGame.size(); i++) {
			multiVideoGame = multiVideoGame + (videoGame.get(i).getPreco() * livros.get(i).getQtd());
		}
		double multiLivros = 0;
		for (int i = 0; i < videoGame.size(); i++) {
			multiLivros = multiLivros + (livros.get(i).getPreco() * videoGame.get(i).getQtd());
		}
		double total = multiVideoGame + multiLivros;
		System.out.println("O patrimonio total da loja e de: " + getNome() + " R$"); return total;
		}
}