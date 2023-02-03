package br.com.alura.equals_hashcode;

// https://unibb.alura.com.br/course/java-collections/task/14169

public class AulaEquals implements Comparable<AulaEquals>{

    private String titulo;
    private int tempo;

    public AulaEquals(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }
    
    // vinculado a implements Comparable para comparar strings 
    @Override
    public int compareTo(AulaEquals outraAula) {
        return this.titulo.compareTo(outraAula.titulo); // comparar por titulo
    }
}
