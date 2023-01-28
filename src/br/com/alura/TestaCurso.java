package br.com.alura;

public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                    "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        // tentando adicionar da maneira "antiga". Podemos fazer isso? Teste:
        // unmodifiableList na classe curso impede a add fora da classe curso, mantendo o controle na classe curso (boa prática)
//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));  // da exception
        
        System.out.println(javaColecoes.getAulas());
    }

}
