package aula10;

public class Relogio {
	private int segundo;
	private int minuto;
	private int hora;
	
	public Relogio() {}
	
	public void configuraHorario(int segundo, int minuto, int hora) {
		this.segundo = segundo;
		this.minuto = minuto;
		this.hora = hora;
	}
	public void configuraHorario(int segundo, int minuto) {
		this.segundo = segundo;
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}
	public int getMinuto() {
		return minuto;
	}
	public int getHora() {
		return hora;
	}
}
