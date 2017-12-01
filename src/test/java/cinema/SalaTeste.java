package cinema;

import java.time.Duration;
import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SalaTeste {

	private Sala salaA;
	private Sessao sessaoDuroDeMatar, sessaoVingadores, sessaoHomemDeFerro;
	private Sessao sessaoDas13;
	private Sessao sesssao1830;
	private Sessao sessaoMuitoGrande;
	private Sessao sessao21;

	@Before
	public void iniciaValores() {
		salaA = new Sala("Sala A");
		
		Filme duroDeMatar = new Filme("Duro de matar", Duration.ofHours(2));
		sessaoDuroDeMatar = new Sessao(duroDeMatar, LocalTime.of(18, 00));
		
		Filme vingadores = new Filme("Os vingadores", Duration.ofHours(1));
		sessaoVingadores = new Sessao(vingadores, LocalTime.of(19, 00));
		
		Filme homemDeFerro = new Filme("Homem de Ferro", Duration.ofHours(2));
		sessaoHomemDeFerro = new Sessao(homemDeFerro, LocalTime.of(17, 00));
		
		Filme matrix = new Filme("The Matrix", Duration.ofHours(3));
		sessaoDas13 = new Sessao(matrix, LocalTime.of(13, 00));

		Filme piratas = new Filme("Piratas do Caribe", Duration.ofHours(1));
		sesssao1830 = new Sessao(piratas, LocalTime.of(18, 30));
		
		Filme senhorDosAneis = new Filme("Senhor dos Aneis versão extendida", Duration.ofHours(6));
		sessaoMuitoGrande = new Sessao(senhorDosAneis, LocalTime.of(16, 00));
		
		Filme titanic = new Filme("Titanic", Duration.ofHours(3));
		sessao21 = new Sessao(titanic, LocalTime.of(21, 00));
	}
	
	@Test
	public void deveAdiconarSessaoComListaVazia() {
		salaA.adiciona(sessaoDuroDeMatar);
		assertEquals(1, salaA.numeroSessoes());
	}
	
	@Test(expected = ConflitoDeHorarioException.class)
	public void deveLancarExcecaoQuandoTIverConflitoDeHorarioFinal() {
			
		salaA.adiciona(sessaoDuroDeMatar);
		salaA.adiciona(sessaoHomemDeFerro);
		assertEquals(1, salaA.numeroSessoes());
	}
	
	@Test(expected = ConflitoDeHorarioException.class)
	public void deveLancarExcecaoQuandoTIverConflitoDeHorarioInicial() {
				
		salaA.adiciona(sessaoDuroDeMatar);
		salaA.adiciona(sessaoVingadores);
		assertEquals(1, salaA.numeroSessoes());
	}
	
	@Test(expected = ConflitoDeHorarioException.class)
	public void deveLancarExcecaoQuandoTIverConflitoDeHorarioDurante() {
				
		salaA.adiciona(sessaoDuroDeMatar);
		salaA.adiciona(sesssao1830);
		assertEquals(1, salaA.numeroSessoes());
	}
	
	@Test(expected = ConflitoDeHorarioException.class)
	public void deveLancarExcecaoQuandoHoarioForMaiorQueSessaoAtual() {
		salaA.adiciona(sessaoDuroDeMatar);
		salaA.adiciona(sessaoMuitoGrande);
		assertEquals(1, salaA.numeroSessoes());
	}
	
	@Test
	public void deveAdicionarQuandoHorariosSaoAntes() {
		
		salaA.adiciona(sessaoDuroDeMatar);
		salaA.adiciona(sessaoDas13);
		assertEquals(2, salaA.numeroSessoes());
	}
	
	@Test
	public void deveAdicionarQuandoHorariosSaoDepois() {
		
		salaA.adiciona(sessaoDas13);
		salaA.adiciona(sessaoDuroDeMatar);
		assertEquals(2, salaA.numeroSessoes());
	}
	
	@Test
	public void deveAdicionarQuandoHorariosSaoAntesEDepois() {
		
		salaA.adiciona(sessaoDuroDeMatar);
		salaA.adiciona(sessaoDas13);
		salaA.adiciona(sessao21);
		assertEquals(3, salaA.numeroSessoes());
	}
}
