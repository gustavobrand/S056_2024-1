package aula07;

public class ComputadorTeste {

	public static void main(String[] args) {
		Computador pc = new Computador("Meu computador", 1600);
		
		System.out.println(pc.mostraNomeComputador());
		System.out.println(pc.mostraClock());
	}
}
