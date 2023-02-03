package br.com.alura.mapas;

import java.util.ArrayList;
// https://unibb.alura.com.br/course/java-collections/task/14175
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {

//	private int tempoCurso;
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> alunos = new HashSet<>(); 
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }

    @Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " 
                + ", aulas: + " + this.aulas + "]";
    }

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);   // adicionando no map também 
	}
	
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);  // unmodifiableList : nao permitir usar aicionar aulas (com add) fora da classe
    }
    
	public Set<Aluno> getAlunos() {
	    return Collections.unmodifiableSet(alunos);
	}

	public Aluno buscaMatriculado(int numero) {
//
//	    for (Aluno aluno : alunos) {
//	        if (aluno.getNumeroMatricula() == numero) {
//	            return aluno;
//	        }
//	    }
//	    throw new NoSuchElementException("Matricula " + numero
//	            + " não encontrada");
//		
		if (!matriculaParaAluno.containsKey(numero)) {  // caso nao exista na lista, retorna exception
		    throw new NoSuchElementException("Matricula " + numero
	            + " não encontrada");		
		    }
		return matriculaParaAluno.get(numero);
	}
}
		