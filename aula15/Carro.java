package aula15;

public class Carro {
	private String nome;
	private String cor;
	private float peso;
	
	public Carro(String nome, String cor, float peso) {
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", cor=" + cor + ", peso=" + peso + "]";
	}	
}
