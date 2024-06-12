package aula14;

import aula13.Conta;

public class ContaBancaria {
	protected String cliente;
	protected int num_conta;
	protected float saldo;
		
	public ContaBancaria(String cliente, int num_conta, float saldo) {
		this.cliente = cliente;
		this.num_conta = num_conta;
		this.saldo = saldo;
	}
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getNum_conta() {
		return num_conta;
	}
	public float getSaldo() {
		return saldo;
	}
	
	public boolean sacar(float valor) {
		if (saldo >= valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
	public void depositar(float valor) {
		saldo = saldo + valor;
	}

	public static void mostrar(ContaBancaria cc) {
		System.out.println(cc.toString());
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [cliente=" + cliente + 
				", num_conta=" + num_conta + ", saldo=" + saldo + "]";
	}
	
}
