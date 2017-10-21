package com.opensanca.trilharest.filmes.filmes;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class FilmesTest {

	@Test
	public void foraDeExibicaoSeDatasNulas() {
	
		Filme filme = new Filme();
		
		boolean resultado = filme.emExibicao(LocalDate.of(2017, 10, 21));
		
		Assert.assertFalse(resultado);
	}
	
	@Test
	public void foraDeExibicaoSeInicioExibicaoNulo() {
	
		Filme filme = new Filme();
		
		filme.setFimExibicao( LocalDate.of(2017, 10, 30) );
		
		boolean resultado = filme.emExibicao(LocalDate.of(2017, 10, 21));
		
		Assert.assertFalse(resultado);
	}
	
	@Test
	public void foraDeExibicaoSeFimExibicaoNulo() {
	
		Filme filme = new Filme();
		
		filme.setInicioExibicao( LocalDate.of(2017, 10, 30) );
		
		boolean resultado = filme.emExibicao(LocalDate.of(2017, 10, 21));
		
		Assert.assertFalse(resultado);
	}
	
	@Test
	public void emExibicaoSeDentroDeIntervaloDeDatas() {

		Filme filme = new Filme();
		
		filme.setInicioExibicao( LocalDate.of(2017, 10, 1) );
		filme.setFimExibicao( LocalDate.of(2017, 10, 30) );
		
		boolean resultado = filme.emExibicao(LocalDate.of(2017, 10, 21));
		
		Assert.assertTrue(resultado);

	}
	
	@Test
	public void foraDeExibicaoSeForaDeIntervaloDeDatas() {

		Filme filme = new Filme();

		filme.setInicioExibicao( LocalDate.of(2017, 10, 1) );
		filme.setFimExibicao( LocalDate.of(2017, 10, 10) );

		boolean resultado = filme.emExibicao(LocalDate.of(2017, 10, 21));

		Assert.assertFalse(resultado);
	}
	
	@Test
	public void emExibicaoSeFimExatamenteHoje() {
		
	}
	
}
