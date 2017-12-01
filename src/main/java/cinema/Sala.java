package cinema;

import java.util.Collection;
import java.util.TreeSet;

public class Sala {

	private String nome;
	private Collection<Sessao> sessoes;
	
	public Sala(String nome) {
		this.nome = nome;
		this.sessoes = new TreeSet<>();
	}
	
	
	public boolean adiciona(final Sessao novaSessao) {
	
		boolean conflito = sessoes.stream()
			.anyMatch(sessao -> sessao.temConflito(novaSessao));
		
		if(conflito) {
			return false;
		}
		
		sessoes.add(novaSessao);
		System.out.println("Adicionando: " + novaSessao);
		return true;
	}

	public int numeroDeSessoes() {
		return sessoes.size();
	}
	
	public String getNome() {
		return nome;
	}


	@Override
	public String toString() {
		return "Sala [nome=" + nome + ", sessoes=" + sessoes + "]";
	}
	
}
