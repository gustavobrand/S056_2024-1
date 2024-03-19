package aula05;

import java.util.Scanner;

public class ContaTeste {

	public static void main(String[] args) {
		// Scanner entrada = new Scanner(System.in);
 		Conta minhaNovaConta = new Conta();
		Conta contaDoJoao = new Conta();
		Conta contaDaMaria = new Conta();
		
  		// minhaNovaConta.saldo = 100;
		minhaNovaConta.Depositar(100);
		if (minhaNovaConta.Sacar(60)) {
			System.out.println(minhaNovaConta.gerarExtrato());
		} else {
			System.out.println("Saldo insuficiente... ");
		}
		if (minhaNovaConta.Sacar(60)) {
			System.out.println(minhaNovaConta.gerarExtrato());
		} else {
			System.out.println("Saldo insuficiente... ");
		}
	}

}
