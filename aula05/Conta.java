package aula05;

public class Conta {
	
	String tipo;
	float saldo;
	int numero;
	float limite;
	int agencia;
	String cliente;
	
	boolean Sacar(float valor) {
		if ((saldo - valor) >= 0) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
	void Depositar(float valor) {
		saldo = saldo + valor;
  		// saldo += valor;
	}
	String gerarExtrato() {
		String saldoAtual = "Seu saldo eh R$" + saldo;
		return saldoAtual;
	}
}
