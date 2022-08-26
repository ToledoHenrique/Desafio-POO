package Lista;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		idadeAnos i1 = new idadeAnos();
		i1.nomes.add("João");
		i1.nomes.add("Leandro");
		i1.nomes.add("Paulo");
		i1.nomes.add("Jessica");
		
		i1.idades.add(15);
		i1.idades.add(21);
		i1.idades.add(17);
		i1.idades.add(19);
		
		System.out.println("Numero total de pessoas dentro da lista: " + i1.nomes.size());
		
		Iterator<Integer> iteIdade = i1.idades.iterator();
		int contador = 0;
		
		while (iteIdade.hasNext()) {
			int n = (Integer)iteIdade.next();
			if (n < 18) {
				iteIdade.remove();
				i1.nomes.remove(contador);
				contador --;
			}
			contador ++;
		}
		
		System.out.println("Numero de pessoas com mais de 18 anos: " + i1.nomes.size());
		System.out.println("Nome das pessoas com mais de 18 anos: " + i1.nomes);
	}
}