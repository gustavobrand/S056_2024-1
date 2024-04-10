package aula08;

public class TurmaTeste {

	public static void main(String[] args) {
		Aluno joao = new Aluno("Joao da Silva", 7);
		Aluno maria = new Aluno("Maria da Silva", 8);
		Turma t1 = new Turma("S056", joao, maria);
		
		System.out.println("Turma: " + t1.getNomeTurma());
		
		System.out.println("Aluno: " + t1.getAluno1().getNome());
		System.out.println("Nota: " + t1.getAluno1().getNota());
		
		System.out.println("Aluno: " + t1.getAluno2().getNome());
		System.out.println("Aluno: " + t1.getAluno2().getNota());
	}

}
