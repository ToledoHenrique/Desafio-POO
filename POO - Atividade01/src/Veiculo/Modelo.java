package Veiculo;
public abstract class Modelo {
	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private float Km;
	private boolean IsLigado;
	private int LitrosCombustivel;
	private int Velocidade;
	private Double Preco;
	
	public Modelo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco) {
		super();
		Marca = marca;
		Modelo = modelo;
		Placa = placa;
		Cor = cor;
		Km = km;
		IsLigado = isLigado;
		LitrosCombustivel = litrosCombustivel;
		Velocidade = velocidade;
		Preco = preco;
	}
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		this.Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		this.Modelo = modelo;
	}
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		this.Placa = placa;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		this.Cor = cor;
	}
	public float getKm() {
		return Km;
	}
	public void setKm(float km) {
		this.Km = km;
	}
	public boolean isLigado() {
		return IsLigado;
	}
	public void setIsLigado(boolean isLigado) {
		this.IsLigado = isLigado;
	}
	public int getLitrosCombustivel() {
		return LitrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.LitrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return Velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.Velocidade = velocidade;
	}
	
	public Double getPreco() {
		return Preco;
	}
	public void setPreco(Double preco) {
		this.Preco = preco;
	}
	
	public abstract void Ligar();
	
	public abstract void Desligar(); 
	
	public abstract void Acelerar();
	
	public abstract void Frear();
	
	public abstract void Abastecer(int combustivel);
	
	public abstract void Pintar(String cor);
}