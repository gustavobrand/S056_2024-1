package aula04;

import java.util.Scanner;

public class atividade02T2item2 {
	public static void main(String[] args) {
//		Scanner entrada = new Scanner(System.in);
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.print("Numero: ");
		int num = entrada.nextInt();
		if (ehPositivo(num)) {
			System.out.println("Nro é positivo");
		} else {
			System.out.println("Nro é negativo");
		}
	}
	public static boolean ehPositivo(int num) {
		if (num >= 0) {
			return true;
		}
		return false;
	}

}
