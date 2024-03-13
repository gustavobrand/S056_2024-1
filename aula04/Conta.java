package aula04;

public class Conta {

	float saldo;
	int numero;
	
	boolean sacar(float valor) {
		saldo = saldo - valor;
		return true;
	}
}
