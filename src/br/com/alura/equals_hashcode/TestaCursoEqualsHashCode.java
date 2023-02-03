package br.com.alura.equals_hashcode;

//https://unibb.alura.com.br/course/java-collections/task/14203
public class TestaCursoEqualsHashCode {

	public static void main(String[] args) {

		System.out.println(" ---------------- Trabalhando com Set <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ");
		CursoEqualsHashcodeSet javaColecoesSet = new CursoEqualsHashcodeSet("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoesSet.adiciona(new AulaEquals("Trabalhando com Set ", 21));

		AlunoEqualsHascode a1Set = new AlunoEqualsHascode("Rodrigo Turini", 34672);
		AlunoEqualsHascode a2Set = new AlunoEqualsHascode("Guilherme Silveira", 5617);
		AlunoEqualsHascode a3Set = new AlunoEqualsHascode("Mauricio Aniche", 17645);

		javaColecoesSet.matricula(a1Set);
		javaColecoesSet.matricula(a2Set);
		javaColecoesSet.matricula(a3Set);

		CursoEqualsHashcodeList javaColecoesList = new CursoEqualsHashcodeList("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoesList.adiciona(new AulaEquals("Trabalhando com List", 22));

		AlunoEqualsHascode a1List = new AlunoEqualsHascode("Rodrigo Turini", 34672);
		AlunoEqualsHascode a2List = new AlunoEqualsHascode("Guilherme Silveira", 5617);
		AlunoEqualsHascode a3List = new AlunoEqualsHascode("Mauricio Aniche", 17645);

		System.out.println("Todos os alunos matriculados: ");
		javaColecoesSet.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println("1 --------------------------------------------------");
		AlunoEqualsHascode turini = new AlunoEqualsHascode("Rodrigo Turini", 34672);
		
		System.out.println("a1Set :" + a1Set);
		System.out.println("turini :" + turini);
		System.out.println("a1Set == turini ? " + (a1Set == turini));
		System.out.println("a1Set.equals(turini) ? " + (a1Set.equals(turini)));

		System.out.println("2 --------------------------------------------------");

		System.out.println("a1Set.equals(turini) ? ");
		System.out.println(a1Set.equals(turini));

		System.out.println("a1Set.equals(a1Set) ? ");
		System.out.println(a1Set.equals(a1Set));

		System.out.println("javaColecoes.estaMatriculado(turini)? ");
		System.out.println(javaColecoesSet.estaMatriculado(turini));
		
		System.out.println("a1.hashCode() == turini.hashCode() ? " + (a1Set.hashCode() == turini.hashCode()));

		
		
	}
}
