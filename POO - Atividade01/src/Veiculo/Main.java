package Veiculo;
public abstract class Main {
	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("FORD", "RANGER XL", "DT2K98", "VERMELHO", 1.234f, true, 0, 60, 218.999);
		//Status do veiculo:
		v1.Status();
		
		//Ligando o veiculo:
		v1.setIsLigado(false);		
		v1.Ligar();
		System.out.println("Estado atual do carro: " + v1.isLigado() + " (True = Ligado, False = Desligado)");
		
		//Acelerando o veiculo:
		v1.setVelocidade(30);
		v1.Acelerar();
		System.out.println("Velocidade atual do veiculo: " + v1.getVelocidade() + " Km/h");
		
		//Freando o veiculo:
		v1.setVelocidade(50);
		v1.Frear();
		System.out.println("Velocidade atual do veiculo: " + v1.getVelocidade() + " Km/h");
		
		//Abastecendo o veiculo:
		v1.setLitrosCombustivel(40);
		v1.Abastecer(20);
		System.out.println("Capacidade, em litros, do tanque: " + v1.getLitrosCombustivel() + " litros");
		
		//Desligando o veiculo:
		v1.setIsLigado(true);
		v1.Desligar();
		System.out.println("Estado atual do carro: " + v1.isLigado() + " (True = Ligado, False = Desligado)");
		
		//Pintando o veiculo:
		v1.setCor("VERMELHO");
		v1.Pintar("AZUL");
		System.out.println("Cor atual do veiculo: " + v1.getCor());
	}
}