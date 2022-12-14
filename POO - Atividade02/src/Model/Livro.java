package Model;

import Interface.Imposto;

public class Livro extends Produto implements Imposto {
	
	private String autor;
	private String tema;
	private int qtdPag;
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	@Override
	public void calculaImposto() {
		double imposto = 0;
		if (getTema() == "educativo") {
			imposto = 0;
			System.out.println("Livros de Educacao nao possuem taxa de imposto! Livro: " + getNome());
		} else {
			imposto = getPreco() * 1/10;
			System.out.println("R$ " + imposto + " de imposto no livro! Livro: " + getNome());
		}
	}
}