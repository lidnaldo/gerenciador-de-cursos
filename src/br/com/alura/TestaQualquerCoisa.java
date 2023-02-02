package br.com.alura;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestaQualquerCoisa {

	public static void main(String[] args) {
	
		testaLikedListCom_foreach();

		testaLikedListCom_Iterator_While();

	
	
	}

	// LISTA COM while com iterador--------------------------
	private static void testaLikedListCom_Iterator_While() {
        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");
        
        Iterator<String> it = letras.iterator();

        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
	}

	// LISTA COM foreach ----------------------------------
	private static void testaLikedListCom_foreach() {
		// TODO Auto-generated method stub
		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

		letras.forEach(letra -> {
		    System.out.println(letra);
		});
	}


}
	

