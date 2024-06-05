package aula13;

public class Pessoa {
	protected String nome;
	protected float salario;
	
	// Source -> Generate Constructor using fields
	public Pessoa(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
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
	
	// Source -> Generate toString
	@Override
	public String toString() {
		return "Pessoa [nome: " + nome + ", salario: R$" + getSalario() + "]";
	}
}
