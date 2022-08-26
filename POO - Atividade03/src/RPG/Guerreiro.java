package RPG;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	private List<String> habilidade = new ArrayList<String>();
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidade) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.habilidade = habilidade;
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
		System.out.println("Habilidades: " + getHabilidade());
		System.out.println("================================================");
	}
	
	public void lvlUp() {
		if (this.getXp() == 1);
			setLevel(getLevel() + 1);
			setVida(getVida() + 6);
			setMana(getMana() + 1);
			setInteligencia(getInteligencia() + 1);
			setForca(getForca() + 6);
			System.out.println("Parabens... Seu personagem aumentou de nivel: LVL " + getLevel());
			System.out.println(getNome() + " aprendeu uma nova habilidade... " + getHabilidade());
	}
	
	public List<String> getHabilidade() {
		return habilidade;
	}
	
	public void setMagia(List<String> habilidade) {
		this.habilidade = habilidade;
	}
	
	public void novaMagia(String Habilidade) {
		habilidade.add(Habilidade);
	}
	
	public int attack() {
		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(300);
		int valorAttack = (getForca() * getLevel() + numeroAleatorio);
		return valorAttack;
	}
}