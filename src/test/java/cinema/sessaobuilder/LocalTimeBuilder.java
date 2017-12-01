package cinema.sessaobuilder;

import java.time.LocalTime;

public class LocalTimeBuilder {

	private int horas;
	private int minutos;

	public LocalTimeBuilder(int horas, int minutos) {
		this.horas = horas;
		this.minutos = minutos;
	}

	public static MinutosPartBuilder as(int horas) {
		return new MinutosPartBuilder(horas);
	}
	
	public LocalTime build() {
		return LocalTime.of(horas, minutos);
	}
}
