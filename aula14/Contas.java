package aula14;

public class Contas {

	public static void main(String[] args) {
//		ContaBancaria c1 = new ContaBancaria("Joao", 1234, 500f);
		ContaPoupanca c2 = new ContaPoupanca("Maria", 2345, 1000f, 30);
		ContaEspecial c3 = new ContaEspecial("Gustavo", 3456, 600f, 1000f);
				
//		c1.sacar(400);
//		c2.sacar(100);
//		System.out.println(c1);
//		System.out.println(c2);
//		
//		c1.depositar(100);
//		c2.depositar(100);
//		System.out.println(c1);
//		System.out.println(c2);
//		
//		c2.calcularNovoSaldo(1f);		
//		System.out.println(c2);
		
		ContaBancaria.mostrar(c2); // ContaPoupanca
		ContaBancaria.mostrar(c3); // ContaEspecial
	}
}
