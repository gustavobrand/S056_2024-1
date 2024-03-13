package aula04;

import java.util.Scanner;

public class atividade02T2item1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Numero: ");
		int num = entrada.nextInt();
		imprimirTabuada(num);
	}
	public static void imprimirTabuada(int n) {
		for (int i=1 ; i<=10 ; i++) {
//			System.out.println(i + " * " + n + " = " + (i*n));
			System.out.printf("%d * %d = %d\n", i, n, (i*n));
		}
	}
}
