package aula03;

import java.util.Scanner;

public class atividade01t1item1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Numero A: ");
		int A = entrada.nextInt();
		System.out.print("Numero B: ");
		int B = entrada.nextInt();
		int C;
		if (A != B) {
			C = A * B;
		} else {
			C = A + B;
		}
		System.out.println("Resultado: " + C);
	}
}
