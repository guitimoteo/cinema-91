package cinema.sessaobuilder;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import cinema.Filme;

public class FilmeBuilder {

	private String nome;
	private int duracao;
	private ChronoUnit unidade;
	
	FilmeBuilder(String nome, int duracao, ChronoUnit hours) {
		this.nome = nome;
		this.duracao = duracao;
		this.unidade = hours;
	}

	public static DuracaoPart comNome(String nome) {
		return new DuracaoPart(nome);
	}
	
	Filme build() {
		return new Filme(nome, Duration.of(duracao, unidade));
	}
}
