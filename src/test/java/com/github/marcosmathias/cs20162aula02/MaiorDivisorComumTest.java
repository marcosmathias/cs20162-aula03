/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.marcosmathias.cs20162aula02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaiorDivisorComumTest {
	
	@Test
	public void testeInstancia() {
		MaiorDivisorComum instancia = new MaiorDivisorComum();
	}
		
	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaSemRecursao() {
		MaiorDivisorComum.CrivoEratostenes(5, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaNegativa() {
		MaiorDivisorComum.CrivoEratostenes(5, -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaBMaior() {
		MaiorDivisorComum.CrivoEratostenes(5, 10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaNula() {
		MaiorDivisorComum.CrivoEratostenes(0, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaSubtracao() {
		MaiorDivisorComum.CrivoEratostenesSubtracoes(5, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaSubtracaoNegativa() {
		MaiorDivisorComum.CrivoEratostenesSubtracoes(5, -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaSubtracaoBMaior() {
		MaiorDivisorComum.CrivoEratostenesSubtracoes(5, 10);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaSubtracaoNula() {
		MaiorDivisorComum.CrivoEratostenesSubtracoes(0, 0);
	}
	
	@Test
	public void MDCSemRecursao() {
		assertEquals(120, MaiorDivisorComum.CrivoEratostenes(360, 240));
	}
	
	@Test
	public void MDCSubtracao() {
		assertEquals(120, MaiorDivisorComum.CrivoEratostenesSubtracoes(360, 240));
	}

}
