package aula15;

public class IngressoTeste {

	public static void main(String[] args) {
		IngressoPista pista = new IngressoPista();		
		IngressoVip vip = new IngressoVip();
		IngressoBackstage back = new IngressoBackstage();
		
		Show portoAlegreShow = new Show();
		portoAlegreShow.adicionarTicket(pista);
		portoAlegreShow.adicionarTicket(vip);
		portoAlegreShow.adicionarTicket(back);
		
		portoAlegreShow.imprimirTickets();

	}

}
