package RPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
	private List<String> magia = new ArrayList<String>();
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.magia = magia;
	}
	
	public void Status() {
		System.out.println("================== PERSONAGEM ==================");
		System.out.println("Nome: " + getNome());
		System.out.println("Vida: " + getVida());
		System.out.println("Mana: " + getMana());
		System.out.println("XP: " + getXp());
		System.out.println("Inteligencia: " + getInteligencia());
		System.out.println("Poder: " + getForca());
		System.out.println("LVL: " + getLevel());
		System.out.println("Magias: " + getMagia());
		System.out.println("================================================");
	}
	
	public void lvlUp() {
		if (this.getXp() == 1);
			setLevel(getLevel() + 1);
			setVida(getVida() + 1);
			setMana(getMana() + 6);
			setInteligencia(getInteligencia() + 6);
			setForca(getForca() + 1);
			System.out.println("Parabens... Seu personagem aumentou de nivel: LVL " + getLevel());
			System.out.println(getNome() + " aprendeu uma nova magia... " + getMagia());
	}
	
	public List<String> getMagia() {
		return magia;
	}
	
	public void setMagia(List<String> magia) {
		this.magia = magia;
	}
	
	public void novaMagia(String Magia) {
		magia.add(Magia);
	}
	
	public int attack() {
		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(300);
		int valorAttack = (getInteligencia() * getLevel() + numeroAleatorio);
		return valorAttack;
	}
}