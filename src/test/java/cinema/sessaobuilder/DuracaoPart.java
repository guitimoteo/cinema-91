package cinema.sessaobuilder;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DuracaoPart {

	private String nome;

	 DuracaoPart(String nome) {
		this.nome = nome;
	}
	
	public UnidadeDeTempoBuilder eDuracao(int duracao) {
				return  new UnidadeDeTempoBuilder(nome,duracao);
	}
}
