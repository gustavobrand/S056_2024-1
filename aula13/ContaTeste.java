package aula13;

public class ContaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta(100f, "Gustavo");
		ContaCorrente c2 = new ContaCorrente(100f, "Joao", 10f);
		ContaPoupanca c3 = new ContaPoupanca(100f, "Maria", 1f);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
