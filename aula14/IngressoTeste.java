package aula14;

public class IngressoTeste {

	public static void main(String[] args) {
		IngressoPista pista = new IngressoPista();		
		IngressoVip vip = new IngressoVip();
		IngressoBackstage back = new IngressoBackstage();
		
//		System.out.println(pista);
//		System.out.println(vip);
//		System.out.println(back);
		
		Ingresso.mostraIngressos(pista);
		Ingresso.mostraIngressos(vip);
		Ingresso.mostraIngressos(back);

	}

}
