package aula14;

public class Pessoa {
	protected String nome;
	protected float salario;
	protected float bonusMensal;
	
	// Source -> Generate Constructor using fields
	public Pessoa(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
		this.bonusMensal = 0;
	}	
	public Pessoa(String nome, float salario, float bonusMensal) {
		this.nome = nome;
		this.salario = salario;
		this.bonusMensal = bonusMensal;
	}

	// Source -> Generate Getters and Setters -> Select All
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}	
	public float getBonusMensal() {
		return bonusMensal;
	}
	public void setBonusMensal(float bonusMensal) {
		this.bonusMensal = bonusMensal;
	}
	
	// Source -> Generate toString
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + 
				", salario=" + getSalario() + 
				", bonusMensal=" + bonusMensal + "]";
	}
}
