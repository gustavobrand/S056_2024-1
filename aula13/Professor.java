package aula13;

public class Professor extends Pessoa {

	// Source -> Generate Constructor from Superclass
	public Professor(String nome, float salario) {
		super(nome, salario);		
	}
	
	// 15% = 15/100 = 0.15
	// Sobreescrevendo o método getSalario para acrescentar +15% sobre o salario.
	public float getSalario() {
		// return salario * (1.15f);
		return salario + (salario * 0.15f);
	}

}
