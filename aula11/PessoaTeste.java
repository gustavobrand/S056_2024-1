package aula11;

public class PessoaTeste {

	public static void main(String[] args) {
		PessoaJuridica pj = new PessoaJuridica(
				"Joao", "Rua abc", 554433223, "000001111", "0002222");
		System.out.println("Nome : " + pj.getNome());
		System.out.println("End : " + pj.getEndereco());
		System.out.println("Fone : " + pj.getTelefone());
		System.out.println("CNPJ: " + pj.getCnpj());
		System.out.println("IE: " + pj.getInscricaoEstadual());
		
		PessoaFisica pf = new PessoaFisica(
				"Maria", "Rua xyz", 55332211, "0000033333", "00044444");
		System.out.println("Nome : " + pf.getNome());
		System.out.println("End : " + pf.getEndereco());
		System.out.println("Fone : " + pf.getTelefone());
		System.out.println("CPF: " + pf.getCpf());
		System.out.println("RG: " + pf.getRg());
	}

}
