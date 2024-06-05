package aula13;

public class ContaPoupanca extends Conta {
	private float rendimentoMes;

	public ContaPoupanca(float saldo, String nome, float rendimentoMes) {
		super(saldo, nome);
		this.rendimentoMes = rendimentoMes;
	}

	public float getRendimentoMes() {
		return rendimentoMes;
	}
	public void setRendimentoMes(float rendimentoMes) {
		this.rendimentoMes = rendimentoMes;
	}
	public float getSaldo() {
		// rendimentoMes esta em valor %, como 1.0 para 1% a.m.
		float rendimento = saldo * (rendimentoMes/100);
		saldo = saldo + rendimento;
		// Alternativa com somente 1 linha
		// saldo = saldo * (1 + rendimentoMes/100);
		return saldo;
		
	}

	@Override
	public String toString() {
		return "ContaPoupanca [rendimentoMes=" + rendimentoMes + 
				", saldo=" + getSaldo() + ", nome=" + nome + "]";
	}
		
}
