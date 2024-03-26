package aula06;

import java.util.Scanner;

public class CalculadoraTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int val1, val2;
		System.out.println("Numero 1: ");
		val1 = entrada.nextInt();
		System.out.println("Numero 2: ");
		val2 = entrada.nextInt();

		Calculadora calc = new Calculadora();
		calc.somar(val1, val2);
		System.out.println("Ultimo resultado: " + calc.ultimoResultado());
		System.out.println("Ultima operacao: " + calc.ultimaOperacao());

		calc.subtrair(val1, val2);
		System.out.println("Ultimo resultado: " + calc.ultimoResultado());
		System.out.println("Ultima operacao: " + calc.ultimaOperacao());
	}
}
