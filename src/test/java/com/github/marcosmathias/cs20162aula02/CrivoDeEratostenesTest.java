/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.marcosmathias.cs20162aula02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CrivoDeEratostenesTest {
	
	int n;
	int[] a;
	
	@Test
	public void testeInstancia() {
		CrivoDeEratostenes instancia = new CrivoDeEratostenes();
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntrada() {
		n = 0;
		a = new int[n];
		CrivoDeEratostenes.CrivoEratostenes(a, n);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeVetorEntrada(){
		n = 2;
		a = new int[n+1];
		a[2] = 1;
		CrivoDeEratostenes.CrivoEratostenes(a, n);
	}
	
	@Test
	public void testePrimo(){
		n = 5;
		a = new int[n+1];
		assertEquals(true, CrivoDeEratostenes.CrivoEratostenes(a, n));
	}
	
	@Test
	public void testeNaoPrimo(){
		n = 6;
		a = new int[n+1];
		assertEquals(false, CrivoDeEratostenes.CrivoEratostenes(a, n));
	}
	
	@Test
	public void testeNaoPrimoMaior(){
		n = 933212;
		a = new int[n+1];
		assertEquals(false, CrivoDeEratostenes.CrivoEratostenes(a, n));
	}
	
	@Test
	public void testePrimoMaior(){
		n = 933217;
		a = new int[n+1];
		assertEquals(true, CrivoDeEratostenes.CrivoEratostenes(a, n));
	}
	
	
	
	

}
