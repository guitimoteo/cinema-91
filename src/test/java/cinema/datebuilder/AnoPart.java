package cinema.datebuilder;

import java.time.Month;

public class AnoPart {

	private int dia;
	private Month mes;

	AnoPart(int dia, Month mes) {
		this.dia = dia;
		this.mes = mes;
	}

	public LocalDateBuilder de(int ano) {
		return new LocalDateBuilder(dia, mes, ano);
	}
}