/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.marcosmathias.cs20162aula02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumeroPrimoTest {
	
	@Test
	public void testeInstancia() {
		NumeroPrimo instancia = new NumeroPrimo();
	}

	@Test(expected=IllegalArgumentException.class)
	public void testeEntrada() {
		NumeroPrimo.Primo(0);
	}
	
	@Test
	public void numeroPrimo(){
		assertEquals(true, NumeroPrimo.Primo(3));
	}
	
	@Test
	public void numeroPrimoMaior(){
		assertEquals(true, NumeroPrimo.Primo(933217));
	}
	
	@Test
	public void numeroNaoPrimo(){
		assertEquals(false, NumeroPrimo.Primo(8));
	}
	
	@Test
	public void numeroNaoPrimoMaior(){
		assertEquals(false, NumeroPrimo.Primo(933212));
	}
	
}
