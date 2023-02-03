package br.com.alura.equals_hashcode;

import java.util.ArrayList;
// https://unibb.alura.com.br/course/java-collections/task/14175
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CursoEqualsHashcodeSet {

//	private int tempoCurso;
    private String nome;
    private String instrutor;
    private List<AulaEquals> aulas = new ArrayList<AulaEquals>();
    private Set<AlunoEqualsHascode> alunos = new HashSet<>(); 

    public CursoEqualsHashcodeSet(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<AulaEquals> getAulas() {
        return Collections.unmodifiableList(aulas);  // unmodifiableList : nao permitir usar aicionar aulas (com add) fora da classe
    }
    
    public void adiciona(AulaEquals aula) {
        this.aulas.add(aula);
    }
    
    public int getTempoTotal() {
        // forma tradicional
//    	int tempoTotal = 0;
//        for (Aula aula : aulas) {
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;
        
//        forma com map
        return this.aulas.stream().mapToInt(AulaEquals::getTempo).sum();
        
    }
    
    @Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
                + ", aulas: + " + this.aulas + "]";
    }

	public void matricula(AlunoEqualsHascode aluno) {
		this.alunos.add(aluno);
	}
	
	public Set<AlunoEqualsHascode> getAlunos() {
	    return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(AlunoEqualsHascode turini) {
		return this.alunos.contains(turini);
	}

}
