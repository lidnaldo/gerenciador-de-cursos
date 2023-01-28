package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

    public static void main(String[] args) {

//        Set<String> alunos = new HashSet<>();
        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Lidnaldo Coelho");
        alunos.add("Renan Saggio");
        alunos.add("Nico Steppat");
        alunos.add("Nico Steppat"); // outro Nico Steppat, exatamente igual ao anterior

        System.out.println(alunos);
        
        System.out.println(alunos.size());
        
        // 2 formas distintas de fazer o for ----------------
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        // ou
        alunos.forEach(aluno -> {
        	System.out.println(aluno);
        });
        // --------------------------------------------------
        
        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println("pauloEstaMatriculado :" + pauloEstaMatriculado );

        boolean lidnaldoEstaMatriculado = alunos.contains("Lidnaldo Coelho");
        System.out.println("lidnaldoEstaMatriculado :" + lidnaldoEstaMatriculado );

        
    }
}
