package com.github.marcosmathias.cs20162aula02;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.marcosmathias.cs20162aula02.PotenciaComSoma;

public class PotenciaComSomaTest {
	
	@Test
	public void testeInstancia() {
		PotenciaComSoma instancia = new PotenciaComSoma();
	}

	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaNegativa() {
		PotenciaComSoma.Potencia(-1, 6);
	}
	
	@Test
	public void testeEntradaNula() {
		PotenciaComSoma.Potencia(0, 0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaNegativa2() {
		PotenciaComSoma.Potencia(6, -1);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testeEntradaNegativaAmbos() {
		PotenciaComSoma.Potencia(-1, -6);
	}
	
	
	@Test
	public void potenciaComSoma(){
		assertEquals(16, PotenciaComSoma.Potencia(2, 4));
	}
	
	

}
