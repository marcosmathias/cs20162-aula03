/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.marcosmathias.cs20162aula02;

/**
 * Implementação do cálculo de uma potência, utilizando somas.
 *
 * @author Marcos Mathias Pereira
 *
 */

public final class PotenciaComSoma {

	/**
     * Obtém a potência de dois inteiros.
     * 
     * @param x A base da potência.
     * @param y O expoente da potência.
     *
     * @return O valor da potência.

     * @throws IllegalArgumentException Se o primeiro ou segundo número digitados não forem inteiros positivos.
     */
	
	
	public static int Potencia(int x, int y){
		
		if(x < 0 || y < 0){
			throw new IllegalArgumentException("Entrada inválida. Apenas números inteiros positivos são permitidos.");
		}
		
		else
		{
			int potencia = 1;
			int i = 1;
			
			while(i <= y){
				potencia = ProdutoInteirosComSoma.Produto(potencia, x);
				i++;
			}
			
			return potencia;
		}
	}
}