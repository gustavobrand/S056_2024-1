package aula14;

public class ContaPoupanca extends ContaBancaria {
	private int diaDeRendimento;
		
	public ContaPoupanca(String cliente, int num_conta, float saldo, int diaDeRendimento) {
		super(cliente, num_conta, saldo);
		this.diaDeRendimento = diaDeRendimento;
	}
	
	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}
	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

	// Exemplo da taxa de rendimento: 1 para representar 1%
	public void calcularNovoSaldo(float taxaRendimento) {
		saldo = saldo + (saldo * taxaRendimento/100);
	}

	@Override
	public String toString() {
		return "ContaPoupanca [diaDeRendimento=" + diaDeRendimento + 
				", cliente=" + cliente + ", num_conta=" + num_conta
				+ ", saldo=" + saldo + "]";
	}	
}
