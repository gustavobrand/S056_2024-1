package aula13;

public class Diretor extends Pessoa {

	// Source -> Generate Constructor from Superclass
	public Diretor(String nome, float salario) {
		super(nome, salario);
		// Aqui vem outros atributos especializados da classe Diretor, se existirem.
	}
	
	// 20% = 20/100 = 0.2
	// Sobreescrevendo o método getSalario para acrescentar +20% sobre o salario.
	public float getSalario() {
		// return salario * (1.2f);
		return salario + (salario * 0.2f);
	}

}
