package aula15;

import java.util.ArrayList;

public class TesteArrayList {

	public static void testeArraylistInteiros() {
		ArrayList<Integer> listaDeInteiros = new ArrayList<Integer>();
		listaDeInteiros.add(10);
		listaDeInteiros.add(15);
		listaDeInteiros.add(20);
		listaDeInteiros.add(16);
		System.out.println(listaDeInteiros);
		// For tradicional
		for (int i=0; i < listaDeInteiros.size(); i++) {
			if (i == listaDeInteiros.size()-1) {
				System.out.print(listaDeInteiros.get(i) + "["+ i + "]");
			} else {
				System.out.print(listaDeInteiros.get(i) + "["+ i + "] - ");
			}
		}
		System.out.println();
		// For each
		for (Integer minhaPosicao: listaDeInteiros) {
			System.out.print(minhaPosicao + " " );			
		}
		System.out.println();				
	}
	
	public static void testeArraylistStrings( ) {
		ArrayList<String> listaDeStrings = new ArrayList<String>();
		listaDeStrings.add("teste 1");
		listaDeStrings.add("teste 2");
		listaDeStrings.add("teste 3");
		listaDeStrings.add("teste 4");
		System.out.println(listaDeStrings);		
	}
	public static void testeArraylistIngressos() {
		ArrayList<Ingresso> tickets = new ArrayList<Ingresso>();
		Ingresso t1 = new Ingresso(10, "Ingresso Teste 1");
		Ingresso t2 = new Ingresso(20, "Ingresso Teste 2");
		tickets.add(t1);
		tickets.add(t2);
		tickets.add(new Ingresso(30, "Ingresso Teste 3"));
		tickets.add(new Ingresso(40, "Ingresso Teste 4"));
		for (Ingresso ing : tickets) {
			System.out.println(ing);
		}
	}
	public static void main(String[] args) {
		TesteArrayList.testeArraylistInteiros();
		TesteArrayList.testeArraylistStrings();
		TesteArrayList.testeArraylistIngressos();
	}

}
