package br.com.alura;
import java.util.ArrayList;
// https://unibb.alura.com.br/course/java-collections/task/14182
import java.util.Collections;
import java.util.List;

public class TestaCursoComUnmodifiableList {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                    "Lidnaldo Coelho");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        // devido a unmodifiableList na classe curso, não é permitido mudar a lista de cursos de fora da classe curso
//        Collections.sort(aulas);   // Exception in thread "main" java.lang.Error: Unresolved compilation problem: 

        // para conseguirmos iremos utilizar um arrayList "Tradicional" a partir da lista "imutável" da classe curso e "sortea-la" 
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
