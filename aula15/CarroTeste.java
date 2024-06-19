package aula15;

import java.util.ArrayList;

public class CarroTeste {

	public static void main(String[] args) {
		ArrayList<Carro> loja = new ArrayList<Carro>();
		
		loja.add(new Carro("fusca", "amarelo", 2000));
		loja.add(new Carro("gol", "branco", 1200));
		loja.add(new Carro("kombi", "azul", 1500));
		
		for (Carro item : loja) {
			System.out.println(item);
		}		
	}

}
