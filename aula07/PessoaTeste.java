package aula07;

import java.util.Scanner;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome: ");
		p1.setNome(entrada.next());
		System.out.println("Idade: ");
		p1.setIdade(entrada.nextInt());
		System.out.println("Endere�o: ");
		entrada.nextLine();
		p1.setEndereco(entrada.nextLine());
		
		System.out.println("Nome: ");
		p2.setNome(entrada.next());
		System.out.println("Idade: ");
		p2.setIdade(entrada.nextInt());
		entrada.nextLine();
		System.out.println("Endere�o: ");
		p2.setEndereco(entrada.nextLine());
		
		System.out.println("Nome: " + p1.getNome() +", " + p1.getIdade() + " anos");
		System.out.println("Endere�o atual: " + p1.getEndereco());
		System.out.println("Nome: " + p2.getNome() +", " + p2.getIdade() + " anos");
		System.out.println("Endere�o atual: " + p2.getEndereco());

	}

}
