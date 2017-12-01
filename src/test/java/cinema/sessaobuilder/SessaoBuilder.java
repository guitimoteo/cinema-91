package cinema.sessaobuilder;

import java.time.LocalTime;

import cinema.Filme;
import cinema.Sessao;

public class SessaoBuilder {

	private Filme filme;
	private LocalTime horarioInicial;

	SessaoBuilder(Filme filme, LocalTime horarioInicial) {
		this.filme = filme;
		this.horarioInicial = horarioInicial;
	}

	public static HorarioSessaoBuilder comFilme(FilmeBuilder filmeBuilder) {
		Filme filme = filmeBuilder.build();
		return new HorarioSessaoBuilder(filme);
	}
	
	public Sessao build() {
		return new Sessao(filme, horarioInicial);
	}
}
