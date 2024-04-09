package aula08;

public class NotaAlunoTeste {

	public static void main(String[] args) {
		NotaAluno joao = new NotaAluno();
		joao.setNomeAluno("Joao");
		joao.setNota1(5f);
		joao.setNota2(6f);
		
		NotaAluno maria = new NotaAluno("Maria", 7f, 8f);

		System.out.println(joao.mostraNomeAluno() + ": nota " + joao.mediaDoAluno());
		joao.statusAluno();
		System.out.println(maria.mostraNomeAluno() + ": nota " + maria.mediaDoAluno());
		maria.statusAluno();
		
	}

}
