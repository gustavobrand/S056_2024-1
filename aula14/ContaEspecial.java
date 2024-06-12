package aula14;

public class ContaEspecial extends ContaBancaria {
	private float limite;

	public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
		super(cliente, num_conta, saldo);
		this.limite = limite;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	public boolean sacar(float valor) {
		if ((saldo + limite) >= valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}
	public boolean sacar_(float valor) {
		if ((saldo + limite) >= valor) {
			saldo = saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", cliente=" + cliente + 
				", num_conta=" + num_conta + ", saldo=" + saldo + "]";
	}
	
}
