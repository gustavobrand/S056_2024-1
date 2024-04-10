package aula08;

public class MaeTeste {

	public static void main(String[] args) {
		Filho joao = new Filho("Joao da Silva");
		Filho maria = new Filho("Maria da Silva");
		
		Mae joana = new Mae("Joana da Silva", joao, maria);
		
		System.out.println("Mae: " + joana.getNomeMae());
		System.out.println("Filho: " + joana.getFilho1().getNome());
		System.out.println("Filho: " + joana.getFilho2().getNome());
	}

}
