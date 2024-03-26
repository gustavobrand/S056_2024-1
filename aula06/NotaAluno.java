package aula06;

public class NotaAluno {
	String nomeAluno;
	float nota1;
	float nota2;
	
	String mostraNomeAluno() {
		return nomeAluno;
	}
	void statusAluno() {
		// if ((nota1 + nota2)/2 >= 7f) {
		if ( mediaDoAluno() >= 7f) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
	}
	float mediaDoAluno() {
		return (nota1 + nota2)/2f;
	}
}


