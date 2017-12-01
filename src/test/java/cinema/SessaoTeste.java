package cinema;

import org.junit.Test;


import static cinema.sessaobuilder.LocalTimeBuilder.as;
import static cinema.sessaobuilder.FilmeBuilder.comNome;
import static cinema.sessaobuilder.SessaoBuilder.comFilme;

public class SessaoTeste {

	@Test
	public void teste() {
		
		Sessao sessaoDas18 = comFilme(comNome("Matrix").eDuracao(2).horas())
				.ocorrendo(as(14).e(30))
				.build();
		
		System.out.println(sessaoDas18);
	}
}
