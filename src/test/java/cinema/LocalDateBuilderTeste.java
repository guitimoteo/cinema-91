package cinema;

import java.time.LocalDate;

import org.junit.Test;

import static cinema.datebuilder.LocalDateBuilder.dia;
import static java.time.Month.OCTOBER;;

public class LocalDateBuilderTeste {

	@Test
	public void test() {
		
		LocalDate nossaData = dia(01).de(OCTOBER).de(2017).build();
		System.out.println(nossaData);
	}
}
