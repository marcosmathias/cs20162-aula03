/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.marcosmathias.cs20162aula02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumeroHarmonicoTest {
	
	@Test
	public void testeInstancia() {
		NumeroHarmonico instancia = new NumeroHarmonico();
	}

	@Test(expected=IllegalArgumentException.class)
	public void testeEntrada() {
		NumeroHarmonico.numeroHarmonico(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntrada2() {
		NumeroHarmonico.numeroHarmonico(-3);
	}
	
	@Test
	public void numeroHarmonico(){
		assertEquals(3/2, NumeroHarmonico.numeroHarmonico(2), 0);
	}
	
	@Test
	public void numeroHarmonico2(){
		assertEquals(11/6, NumeroHarmonico.numeroHarmonico(3), 0);
	}
	
}
