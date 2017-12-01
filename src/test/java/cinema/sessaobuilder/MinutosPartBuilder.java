package cinema.sessaobuilder;

public class MinutosPartBuilder {

	private int horas;

	MinutosPartBuilder(int horas) {
		this.horas = horas;
	}

	public LocalTimeBuilder e(int minutos) {
		return new LocalTimeBuilder(horas, minutos);
	}
}
