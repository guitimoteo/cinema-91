package cinema.datebuilder;

import java.time.Month;

public class MesPart {
	
	private int dia;
	
	MesPart(int dia) {
		this.dia = dia;
	}
	
	public AnoPart de(Month mes) {
		return new AnoPart(dia, mes);
	}
}