package aula13;

public class ContaCorrente extends Conta {
	private float tarifaDeManutencao;

	public ContaCorrente(float saldo, String nome, float tarifaDeManutencao) {
		super(saldo, nome);
		this.tarifaDeManutencao = tarifaDeManutencao;
	}

	public float getTarifaDeManutencao() {
		return tarifaDeManutencao;
	}
	public void setTarifaDeManutencao(float tarifaDeManutencao) {
		this.tarifaDeManutencao = tarifaDeManutencao;
	}	
	public float getSaldo() {
		saldo = saldo - tarifaDeManutencao;
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [tarifaDeManutencao=" + tarifaDeManutencao + 
				", saldo=" + getSaldo() + ", nome=" + nome + "]";
	}	
}
