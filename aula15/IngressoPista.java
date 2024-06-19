package aula15;

public class IngressoPista extends Ingresso {

	public IngressoPista() {
		super(40f, "Ingresso Pista (na pista)");
	}

	@Override
	public String toString() {
		return "IngressoPista [valor=" + valor + ", descricao=" + descricao + ", getValor()=" + getValor()
				+ ", getDescricao()=" + getDescricao() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
