package aula07;

public class Computador {
	private String nome;
	private int clock;
	
	public Computador(String n, int c) {
		nome = n;
		clock = c;
	}
	public String mostraNomeComputador() {
		return nome;
	}
	public int mostraClock() {
		return clock;
	}
}
