package aula10;

public class Calculadora {
	private double ultimoResultado;
	
	public Calculadora() {}
	
	public int soma(int a, int b) {
		ultimoResultado = a+b;
		return (int)ultimoResultado;
	}
	public float soma(float a, float b) {
		ultimoResultado = a+b;
		return (float)ultimoResultado;
	}
	public double soma(double a, double b) {
		ultimoResultado = a+b;
		return ultimoResultado;
	}
	public int soma(int a, int b, int c) {
		ultimoResultado = a+b+c;
		return (int)ultimoResultado;
	}
	public float soma(float a, float b, float c) {
		ultimoResultado = a+b+c;
		return (float)ultimoResultado;
	}
	public double soma(double a, double b, double c) {
		ultimoResultado = a+b+c;
		return ultimoResultado;
	}
	public double soma(double a, double b, String c) {
		ultimoResultado = a+b;
		return ultimoResultado;
	}
}
