package aula14;

public class Diretor extends Pessoa {

	// Source -> Generate Constructor from Superclass
	public Diretor(String nome, float salario) {
		super(nome, salario);
		
		// bonusMensal = 20f; // 20% sobre o salario
		setBonusMensal(20f);
	}
		
	// 20% = 20/100 = 0.2
	// Sobreescrevendo o método getSalario para acrescentar +20% sobre o salario.
	public float getSalario() {		
		return salario + (salario * (bonusMensal/100f));
	}
	
}
