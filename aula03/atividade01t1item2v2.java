package aula03;

import java.util.Scanner;

public class atividade01t1item2v2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Numero 1: ");
		int val1 = entrada.nextInt();
		System.out.print("Numero 2: ");
		int val2 = entrada.nextInt();
		System.out.print("Numero 3: ");
		int val3 = entrada.nextInt();
		if (val1 > val2 && val2 > val3) {
			System.out.println(val1+","+val2+","+val3);
		} else if (val1 > val3 && val3 > val2) {
			System.out.println(val1+","+val3+","+val2);
		} else if (val3 > val1 && val1 > val2) {
			System.out.println(val3+","+val1+","+val2);
		} else if (val2 > val1 && val1 > val3) {
			System.out.println(val2+","+val1+","+val3);
		} else if (val2 > val1 && val2 > val3) {
				System.out.println(val2+","+val3+","+val1);
		} else {
			System.out.println(val3+","+val2+","+val1);
		}
	}
}
