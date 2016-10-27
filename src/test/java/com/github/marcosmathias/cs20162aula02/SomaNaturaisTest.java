package com.github.marcosmathias.cs20162aula02;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.marcosmathias.cs20162aula02.SomaNaturais;

public class SomaNaturaisTest {
	
	@Test
	public void testeInstancia() {
		SomaNaturais instancia = new SomaNaturais();
	}

	@Test(expected = IllegalArgumentException.class)
    public void valorNaoNatural() {
        SomaNaturais.somaNaturais(-2);
    }

    @Test
    public void somaNaturais() {
    	assertEquals(10, SomaNaturais.somaNaturais(4));
    }
}
