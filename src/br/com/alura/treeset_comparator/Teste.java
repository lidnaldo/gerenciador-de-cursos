package br.com.alura.treeset_comparator;

//A implementação TreeSet já ordena os seus elementos na hora da inserção. 
//Qual é o critério da ordenação depende e pode ser definido através de um Comparator.

//Crie uma classe que implemente a interface Comparator usando como critério de comparação a 
//idade de funcionários. Crie três funcionários adicionando-os em um TreeSet. Em seguida, 
//itere sobre a lista usando um Iterator para imprimir o nome de cada funcionário.

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Teste {

    public static void main(String args[]) {

        Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        } 
    }
}