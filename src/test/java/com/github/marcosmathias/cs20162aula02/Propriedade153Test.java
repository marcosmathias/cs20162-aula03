/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.marcosmathias.cs20162aula02;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.marcosmathias.cs20162aula02.Propriedade153;

public class Propriedade153Test {

	@Test
	public void testeInstancia() {
		Propriedade153 instancia = new Propriedade153();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntrada() {
		Propriedade153.propriedade153(-1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaMaior() {
		Propriedade153.propriedade153(10000);
	}
	
	@Test
	public void testeEntradaNula() {
		assertEquals(true, Propriedade153.propriedade153(0));
	}
	
	@Test
	public void testeEntradaMaxima() {
		assertEquals(false, Propriedade153.propriedade153(9999));
	}	
	
	@Test
	public void testePropriedadeTrue() {
		assertEquals(true, Propriedade153.propriedade153(153));
	}
	
	@Test
	public void testePropriedadeFalse() {
		assertEquals(false, Propriedade153.propriedade153(152));
	}

}
