package aula08;

public class PessoaTeste {

	public static void main(String[] args) {
		Endereco e1 = new Endereco("Rua abc", 100, "91000-100");
		Pessoa p1 = new Pessoa("Joao", e1);
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Endereço: " + p1.getEnd());		
		System.out.println("Endereço: " + p1.getEnd().getRua());		
		System.out.println("Nro: " + p1.getEnd().getNumero());
		System.out.println("Nro: " + p1.getEnd().getCep());
	}

}
