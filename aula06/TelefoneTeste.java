package aula06;

public class TelefoneTeste {

	public static void main(String[] args) {
		Telefone fone1 = new Telefone();
		Telefone fone2 = new Telefone();
		
		fone1.setNumeroTelefone("977644333");
		fone1.setOperadora("Claro");
		
		fone2.setNumeroTelefone("93222344");
		fone2.setOperadora("Vivo");
		
		System.out.println(fone1.getNumeroTelefone() + " - " + fone1.getOperadora());
		System.out.println(fone1.getOperadora());
		System.out.println(fone2.getNumeroTelefone());
		System.out.println(fone2.getOperadora());
		
	}

}
