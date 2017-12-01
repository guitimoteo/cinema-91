package cinema;

import java.time.Duration;
import java.time.LocalTime;

public class Sessao implements Comparable<Sessao> {

	private LocalTime horarioInicial;
	private Filme filme;
	
	public Sessao(Filme filme, LocalTime horarioInicial) {
		this.filme = filme;
		this.horarioInicial = horarioInicial;
	}
	
	public LocalTime horarioInicial() {
		return horarioInicial;
	}
	
	
	public LocalTime horarioFinal() {
		return horarioInicial.plus(filme.getDuracao());
	}
	
	public Duration getDuracao() {
		return filme.getDuracao();
	}
	
	public Filme getFilme() {
		return filme;
	}

	public boolean temConflito(Sessao sessao) {
		return !(sessao.horarioInicial.isAfter(this.horarioFinal()) || sessao.horarioFinal().isBefore(this.horarioInicial));
	}
	
	@Override
	public int compareTo(Sessao outra) {
		if(this.horarioInicial.isBefore(outra.horarioInicial))
			return -1;
		
		if(this.horarioInicial.isAfter(outra.horarioInicial))
			return 1;
		
		return 0;
	}

	@Override
	public String toString() {
		return "Sessao [horarioInicial=" + horarioInicial + ", filme=" + filme + "]";
	}
}
