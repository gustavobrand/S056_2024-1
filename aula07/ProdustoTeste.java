package aula07;

public class ProdustoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto("Maça", 1.5f);
		Produto p2 = new Produto("Banana", 1.05f, "Banana Prata");
				
		System.out.println(p1.mostraNomeProduto());
		System.out.println(p1.mostraPreco());
		p1.mostradescricaoProduto();
		
		System.out.println(p2.mostraNomeProduto());
		System.out.println(p2.mostraPreco());
		p2.mostradescricaoProduto();
	}

}
