package aula06;

public class Conta {
	
	private String tipo;
	private float saldo;
	private int numero;
	private float limite;
	private int agencia;
	private String cliente;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public boolean Sacar(float valor) {
		if ((saldo - valor) >= 0) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
	public void Depositar(float valor) {
		saldo = saldo + valor;
  		// saldo += valor;
	}
	public String gerarExtrato() {
		String saldoAtual = "Seu saldo eh R$" + saldo;
		return saldoAtual;
	}
	
}
