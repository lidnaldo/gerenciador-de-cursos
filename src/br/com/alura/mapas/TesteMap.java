package br.com.alura.mapas;


/* 
 * Segundo o JavaDoc, um Map também pode ser visto como se fossem de 3 coleções:
 *
 * The Map interface provides three collection views, which allow a map's contents to be viewed as a set of keys, 
 * collection of values, or set of key-value mappings.
 * 
 * Ou seja, temos uma coleção de chaves, uma coleção de valores, e uma coleção das associações. 
 * O interessante é que podemos acessar cada uma das coleções. 
 * 
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {
        Map<String, Integer> nomesParaIdade = new HashMap<>();   // <<<<<<
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        //      Para acessar as chaves temos 
        System.out.println("  ---------------- Para acessar as chaves ------------------");
        Set<String> chaves = nomesParaIdade.keySet();    
        for (String nome : chaves) {
            System.out.println(nome);
        }
        
        //      Para busca dos valores:
        System.out.println("  ---------------- Para busca dos valores ------------------");
        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer idade : valores) {
            System.out.println(idade);
        }
        
        
        // Agora só falta a terceira coleção que devolve a associação. Para tal, existe o método entrySet() e 
        //  cada associação é representado através da classe Entry:
        System.out.println("  ---------------- Para buscar a associação ------------------");
        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();    
        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
        

	}

}
