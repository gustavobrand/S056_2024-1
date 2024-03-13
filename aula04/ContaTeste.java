package aula04;

public class ContaTeste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.numero = 123;
		c1.saldo = 10;
		System.out.println("Saldo atual: " + c1.saldo);
		c1.sacar(6);
		System.out.println("Saldo atual: " + c1.saldo);
		

	}

}
