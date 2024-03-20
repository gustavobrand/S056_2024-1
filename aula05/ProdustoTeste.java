package aula05;

public class ProdustoTeste {

	public static void main(String[] args) {
		Produto p1 = new Produto();
		Produto p2 = new Produto();
		
		p1.nome = "Maça";
		p1.preco = 1.5f; // ou (float)1.5
		p1.descricao = "Maça Fuji";
		p2.nome = "Banana";
		p2.preco = 1.05f;
		p2.descricao = "Banana Prata";
		
		System.out.println(p1.mostraNomeProduto());
		System.out.println(p1.mostraPreco());
		p1.mostradescricaoProduto();
		
		System.out.println(p2.mostraNomeProduto());
		System.out.println(p2.mostraPreco());
		p2.mostradescricaoProduto();
	}

}
