package aula05;

public class ComputadorTeste {

	public static void main(String[] args) {
		Computador pc = new Computador();
		pc.nome = "Meu computador";
		pc.clock = 1600;
		
		System.out.println(pc.mostraNomeComputador());
		System.out.println(pc.mostraClock());
	}

}
