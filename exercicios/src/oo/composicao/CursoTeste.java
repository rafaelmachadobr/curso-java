package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("JavaScript");
		Curso curso3 = new Curso("React");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno2);
		curso3.adicionarAluno(aluno3);
		
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso3.nome + "...");
			System.out.println("...e o meu nome é " + aluno.nome + "\n");
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
	}
}
