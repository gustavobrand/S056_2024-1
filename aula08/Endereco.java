package aula08;

public class Endereco {
	
	private String rua;
	private int numero;
	private String cep;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	public Endereco(String rua, int numero, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
	}
	public Endereco(String rua, int numero, String cep, 
			String complemento, String bairro, String cidade, 
			String estado, String pais) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

}
