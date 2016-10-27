package com.github.marcosmathias.cs20162aula02;

import static org.junit.Assert.*;

import org.junit.Test;

import com.github.marcosmathias.cs20162aula02.ProdutoInteirosComSoma;

public class ProdutoInteirosComSomaTest {
	
	@Test
	public void testeInstancia() {
		ProdutoInteirosComSoma instancia = new ProdutoInteirosComSoma();
	}

	@Test(expected = IllegalArgumentException.class)
	public void primeiroInvalido() {
		ProdutoInteirosComSoma.Produto(0, 5);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void segundoInvalido(){
		ProdutoInteirosComSoma.Produto(5, 0);
	}
	
	@Test
	public void produtoInteiros(){
		assertEquals(25, ProdutoInteirosComSoma.Produto(5, 5));
	}

}
