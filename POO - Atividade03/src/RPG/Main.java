package RPG;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> magia = new ArrayList<String>();
		magia.add("HIGH NOTE");
	 Mago p1 = new Mago("SERAPHINE", 10, 10, 1, 10, 10, 1, magia);
	 p1.Status();
	 p1.lvlUp();
	 p1.novaMagia("SURROUND SOUND");
	 p1.Status();
	 p1.lvlUp();
	 p1.novaMagia("BEAT DROP");
	 p1.Status();
	 p1.lvlUp();
	 System.out.println("");
	 System.out.println("Poder de ataque do Mago: " + p1.attack()  + " de dano magico.");
	 System.out.println("");
	 
	 	List<String> habilidade = new ArrayList<String>();
	 	habilidade.add("FIVE POINT STRIKE");
	 Guerreiro p2 = new Guerreiro("AKALI", 10, 10, 1, 10, 10, 1, habilidade);
	 p2.Status();
	 p2.lvlUp();
	 p2.novaMagia("TWILIGHT SHROUD");
	 p2.Status();
	 p2.lvlUp();
	 p2.novaMagia("SHURIKEN FLIP");
	 p2.Status();
	 p2.lvlUp();
	 System.out.println("");
	 System.out.println("Poder de ataque do Guerreiro: " + p2.attack()  + " de dano fisico.");
	 System.out.println("");
	 
	 System.out.println("Numero de personagens criados: " + Personagem.getPersonagemInstancia());
	}
}