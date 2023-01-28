package br.com.alura;

//   https://unibb.alura.com.br/course/java-collections/task/14160

import java.util.ArrayList;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Modelando a classe Aula";
        String aula2 = "Conhecendo mais de listas";
        String aula3 = "Trabalhando com Cursos e Sets";
        String aula4 = "Essa eh por minha conta";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);        
        aulas.add(aula4);        

        System.out.println(aulas);

        int tamanhoLista = aulas.size();
        
        System.out.println("Tamanho da lista é " + tamanhoLista);
        
        aulas.remove(0);
        System.out.println(aulas);

         
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }
        
        // cuidado! <= faz sentido aqui?
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula : " + aulas.get(i));
        }
        
        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é " + primeiraAula);
        
        aulas.forEach(aula -> {
            System.out.print("Percorrendo: ");
            System.out.println("Aula " + aula );
        });
    }
}
