package Model;

import Interface.Imposto;

public class videoGame extends Produto implements Imposto {
	
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public videoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	
	@Override
	public void calculaImposto() {
		double imposto = 0;
		if (isUsado() == true) {
			imposto = getPreco() * 1/4;
			System.out.println("Imposto no " + getNome() + " usado e de R$" + imposto);
		} else {
			imposto = getPreco() * 9/20;
			System.out.println("Imposto no " + getNome() + " nao usado e de R$" + imposto);
		}
	}
}