package aula03;

public class exercicio7 {

	public static void main(String[] args) {
		for (int i=1; i <= 100; i=i+1) {
			// TODO: fazer i % 2
			int result = i % 2;
			// Se o resto == 0 : par
			// se o resto == 1 : impar
			if (result == 0) {
				System.out.println(i + " é par");
			} else {
				System.out.println(i + " é impar");
			}
		}
	}

}
