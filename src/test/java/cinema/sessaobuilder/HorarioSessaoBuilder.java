package cinema.sessaobuilder;

import java.time.LocalTime;

import cinema.Filme;

public class HorarioSessaoBuilder {


	private Filme filme;

	HorarioSessaoBuilder(Filme filme) {
		this.filme = filme;
	}

	public SessaoBuilder ocorrendo(LocalTimeBuilder localTimeBuilder) {
		LocalTime horarioSessao = localTimeBuilder.build();
		return new SessaoBuilder(filme, horarioSessao);
	}
}
