package br.com.alura.equals_hashcode;

public class AlunoEqualsHascode {
	private String nome;
	private int numeroMatricula;


	public AlunoEqualsHascode(String nome, int numeroMatricula) {
	    if (nome == null) {
	        throw new NullPointerException("Nome não pode ser nulo");
	    }
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	@Override
	public String toString() {
	    return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}
	
	// PRINCIPAIS DIFERENCAS ENTRE A CLASSE ALUNO OVERRIDE DO EQUALS
	@Override
	public int hashCode(){
	    return this.nome.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
	    AlunoEqualsHascode outroAluno = (AlunoEqualsHascode) obj;
	    return this.nome.equals(outroAluno.nome);
	}
}
