package cinema.sessaobuilder;

import java.time.temporal.ChronoUnit;

public class UnidadeDeTempoBuilder {

	 private String nome;
	private int duracao;

	UnidadeDeTempoBuilder(String nome, int duracao) {
		this.nome = nome;
		this.duracao = duracao;
		 	
	}
	
	public FilmeBuilder horas() {
		return new FilmeBuilder(nome, duracao, ChronoUnit.HOURS);
	}
}
