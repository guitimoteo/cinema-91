package cinema.datebuilder;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateBuilder {

	private int dia;
	private Month mes;
	private int ano;

	LocalDateBuilder(int dia, Month mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public static MesPart dia(int dia) {
		return new MesPart(dia);
	}
	
	public LocalDate build() {
		return LocalDate.of(ano, mes, dia);
	}
	
}