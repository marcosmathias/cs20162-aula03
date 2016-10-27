/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.marcosmathias.cs20162aula02;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.marcosmathias.cs20162aula02.Propriedade3025;

public class Propriedade3025Test {
	
	@Test
	public void testeInstancia() {
		Propriedade3025 instancia = new Propriedade3025();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testeEntrada() {
		Propriedade3025.propriedade3025(-1);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testeEntradaMaior() {
		Propriedade3025.propriedade3025(10000);
	}
	
	@Test
	public void testeEntradaNula() {
		assertEquals(true, Propriedade3025.propriedade3025(0));
	}
	
	@Test
	public void testeEntradaMaxima() {
		assertEquals(false, Propriedade3025.propriedade3025(9999));
	}


	@Test
	public void testePropriedadeTrue(){
		assertEquals(true, Propriedade3025.propriedade3025(3025));
	}
	
	@Test
	public void testePropriedadeFalse(){
		assertEquals(false, Propriedade3025.propriedade3025(2));
	}
}