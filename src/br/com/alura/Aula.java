package br.com.alura;

// https://unibb.alura.com.br/course/java-collections/task/14169

public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
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
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo); // comparar por titulo
    }
}
