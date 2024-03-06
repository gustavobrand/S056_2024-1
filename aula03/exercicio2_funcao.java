package aula03;

import java.util.Scanner;

public class exercicio2_funcao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o lado do quadrado: ");
		int lado = entrada.nextInt();
		int result = calculoArea(lado);
		System.out.print("A area do quadrado: " + result);
	}
	public static int calculoArea (int ladoQuadrado) {
		int area = ladoQuadrado*ladoQuadrado;
		return area;
	}

}

