package aula02;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o lado do quadrado: ");
		int lado = entrada.nextInt();
		int result = lado * lado;
		System.out.print("A area do quadrado: " + result);
	}

}

