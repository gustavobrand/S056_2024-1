package aula15;

import java.util.ArrayList;

public class Show {
	private ArrayList<Ingresso> tickets;

	public Show(ArrayList<Ingresso> tickets) {
		this.tickets = tickets;
	}
	public Show() {
		this.tickets = new ArrayList<Ingresso>();
	}	
	public void adicionarTicket(Ingresso ticket) {
		this.tickets.add(ticket);
	}	
	public void imprimirTickets() {
		for (Ingresso ing : tickets) {
			System.out.println(ing);
		}
	}	
}
