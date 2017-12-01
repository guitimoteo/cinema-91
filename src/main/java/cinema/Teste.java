package cinema;

import java.time.Duration;
import java.time.LocalTime;

public class Teste {

	public static void main(String[] args) {

		Filme vingadores = new Filme("Os vingadores", Duration.ofHours(2));
		Filme duroDeMatar = new Filme("Duro de matar", Duration.ofHours(1));
		Filme homemDeFerro = new Filme("Homem de Ferro", Duration.ofHours(3));
		
		Sessao sessaoDuroDeMatar = new Sessao(duroDeMatar, LocalTime.of(20, 00));
		Sessao sessaoVingadores = new Sessao(vingadores, LocalTime.of(13, 00));
		Sessao sessaoHomemDeFerro = new Sessao(homemDeFerro, LocalTime.of(17, 00));

		Sala salaA = new Sala("Sala A");
		
		salaA.adiciona(sessaoDuroDeMatar);
		salaA.adiciona(sessaoVingadores);
		salaA.adiciona(sessaoHomemDeFerro);

		System.out.println(salaA);
	}

}
