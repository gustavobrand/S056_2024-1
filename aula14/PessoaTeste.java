package aula14;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Gustavo", 100);
		Diretor p2 = new Diretor("Joao", 100);
		Professor p3 = new Professor("Maria", 100);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}
