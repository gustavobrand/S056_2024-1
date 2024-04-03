package aula07;

public class FolhaDePagamentoTeste {

	public static void main(String[] args) {
		FolhaDePagamento folha1 = new FolhaDePagamento();
		
		folha1.setNome1("Joao");
		folha1.setSalario1(1000f);
		folha1.setNome2("Maria");
		folha1.setSalario2(-1200f);
		
		System.out.println("Nome: " + folha1.getNome1());
		System.out.println("Salario: R$" + folha1.getSalario1());
		System.out.println("Nome: " + folha1.getNome2());
		System.out.println("Salario: R$" + folha1.getSalario2());
		System.out.println("Total da folha: R$" + folha1.totalFolhaPagamento());
	}

}
