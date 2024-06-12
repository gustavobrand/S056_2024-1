package aula14;

public class Professor extends Pessoa {

	// Source -> Generate Constructor from Superclass
	public Professor(String nome, float salario) {
		super(nome, salario);
		setBonusMensal(15f);
	}
	
	// 15% = 15/100 = 0.15
	// Sobreescrevendo o método getSalario para acrescentar +15% sobre o salario.
	public float getSalario() {
		return salario + (salario * (bonusMensal/100f));
	}

}
