package aula10;

public class PessoaTeste {

	public static void main(String[] args) {
		PessoaJuridica pj = new PessoaJuridica(
				"Joao", "Rua abc", 55443322, "000001111", "0002222");
		System.out.println("Nome : " + pj.getNome());
		System.out.println("End : " + pj.getEndereco());
		System.out.println("Fone : " + pj.getTelefone());
		System.out.println("CNPJ: " + pj.getCnpj());
		System.out.println("IE: " + pj.getInscricaoEstadual());
		
	}

}
