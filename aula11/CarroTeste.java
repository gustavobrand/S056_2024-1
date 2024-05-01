package aula11;

public class CarroTeste {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		
		fusca.montaCarro("Fuscao", "VW");
		System.out.println("Nome: " + fusca.getNome() + 
						   ", Marca: " + fusca.getMarca() + 
						   ", Potencia: " + fusca.getPotencia());
		fusca.montaCarro("Fusca", "VW", 1600);
		System.out.println("Nome: " + fusca.getNome() + 
						   ", Marca: " + fusca.getMarca() + 
						   ", Potencia: " + fusca.getPotencia());
		fusca.montaCarro("Fusquinha", 1300);
		System.out.println("Nome: " + fusca.getNome() + 
						   ", Marca: " + fusca.getMarca() + 
						   ", Potencia: " + fusca.getPotencia());

	}

}
