package Veiculo;
public class Veiculo extends Modelo{
	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, int litrosCombustivel, int velocidade, Double preco) {
		super(marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
	}
	
	public void Status() {
		System.out.println("============ VEICULO ============");
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Placa: " + getPlaca());
		System.out.println("Cor: " + getCor());
		System.out.println("Quilometragem: " + getKm() + " KM" );
		System.out.println("Esta Ligado/Desligado: " + isLigado());
		System.out.println("Combustivel: " + getLitrosCombustivel() + " Litros");
		System.out.println("Velocidade: " + getVelocidade() + " Km/h");
		System.out.println("Valor do Modelo: " + getPreco() + " R$");
		System.out.println("=================================");
	}
	
	public void Ligar() {
		System.out.println("Ligando o veiculo -------------");
		if (isLigado() == false) {
			setIsLigado(true);
		} else { 	
			System.out.println("O veiculo ja se encontra ligado!");
		}
	}
	
	public void Desligar() {
		System.out.println("Desligando o veiculo -------------");
		if (isLigado() == true && getVelocidade() == 0) {
			setIsLigado(false);
		} else if (isLigado() == false) {
			System.out.println("O veiculo esta em movimento e nao pode ser desligado no momento!");
		} else if (getVelocidade() > 0) {
			System.out.println("O veiculo foi desligado!");
			setIsLigado(true);
		}
	}
	
	public void Acelerar() {
		System.out.println("Acelerando o veiculo -------------");
		setVelocidade(getVelocidade() + 20);
	}
	
	public void Abastecer(int combustivel) {
		System.out.println("Abastecendo o veiculo -------------");
		if (getLitrosCombustivel() <= 40 && getLitrosCombustivel() + combustivel <= 60) {
			setLitrosCombustivel(getLitrosCombustivel() + combustivel);
		} else if (getLitrosCombustivel() + combustivel > 60) {
			setLitrosCombustivel(60);
			System.out.println("Capacidade, em litros, do tanque atingida, capacidade total: 60 litros.");
		} else {
			System.out.println("Nao e necessario o abastecimento, pois o tanque se encontra cheio.");
		}
	}
	
	public void Frear() {
		System.out.println("Freando o veiculo -------------");
		if (getVelocidade() >= 20) {
			setVelocidade(getVelocidade() - 20);
		} else if (getVelocidade() < 20 && getVelocidade() > 0) {
			setVelocidade(0);
		} else {
			System.out.println("Veiculo ja se encontra parado.");
		}
	}
	
	public void Pintar(String cor) {
		System.out.println("Pintando o veiculo -------------");
		setCor(cor);
	}
}