package aula04;

import java.util.Scanner;

public class exercicio5_funcao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Nota 1: ");
		float nota1 = entrada.nextFloat();
		System.out.print("Nota 2: ");
		float nota2 = entrada.nextFloat();
		System.out.print("Nota 3: ");
		float nota3 = entrada.nextFloat();
		
		float media = calculoMedia(nota1, nota2, nota3);
		String status = statusAluno(media);
		System.out.println(status);
	}
	
	public static float calculoMedia (float n1, float n2, float n3) {
		return (n1 + n2 + n3)/3;
	}
	
	public static String statusAluno(float media) {
		String status;
		if (media >= 7) {
			status = "Aluno aprovado";
		} else if (media >= 5) {
			status = "Aluno em recuperação";
		} else {
			status = "Aluno reprovado";
		}
		return status;
	}
	
}
