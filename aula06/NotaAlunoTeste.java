package aula06;

public class NotaAlunoTeste {

	public static void main(String[] args) {
		NotaAluno joao = new NotaAluno();
		NotaAluno maria = new NotaAluno();
		NotaAluno jose = new NotaAluno();
		joao.nomeAluno = "Joao";
		jose.nomeAluno = "Jose";
		maria.nomeAluno = "Maria";
		joao.nota1 = 5f;
		joao.nota2 = 6f;
		jose.nota1 = 6f;
		jose.nota2 = 8f;
		maria.nota1 = 7f;
		maria.nota2 = 8f;
		System.out.println(joao.mostraNomeAluno() + ": nota " + joao.mediaDoAluno());
		joao.statusAluno();
		System.out.println(jose.mostraNomeAluno() + ": nota " + jose.mediaDoAluno());
		jose.statusAluno();
		System.out.println(maria.mostraNomeAluno() + ": nota " + maria.mediaDoAluno());
		maria.statusAluno();
		
	}

}
