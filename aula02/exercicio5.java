package aula02;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Nota 1: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Nota 2: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Nota 3: ");
		float nota3 = entrada.nextFloat();
		
		float media = (nota1 + nota2 + nota3)/3;

		if (media >= 7) {
			System.out.println("Aluno aprovado");
		} else if (media >= 5) {
			System.out.println("Aluno em recuperação");
		} else {
			System.out.println("Aluno reprovado");
		}
	}
}
