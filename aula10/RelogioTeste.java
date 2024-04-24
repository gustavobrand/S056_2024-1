package aula10;

public class RelogioTeste {

	public static void main(String[] args) {
		Relogio r1 = new Relogio();
		r1.configuraHorario(10, 10, 10);
		System.out.println(r1.getHora()+":"+r1.getMinuto()+":"+r1.getSegundo());

		r1.configuraHorario(11, 10);
		System.out.println(r1.getHora()+":"+r1.getMinuto()+":"+r1.getSegundo());

		r1.configuraHorario(5, 10, 20);
		System.out.println(r1.getHora()+":"+r1.getMinuto()+":"+r1.getSegundo());

		r1.configuraHorario(6, 10);
		System.out.println(r1.getHora()+":"+r1.getMinuto()+":"+r1.getSegundo());

	}

}
