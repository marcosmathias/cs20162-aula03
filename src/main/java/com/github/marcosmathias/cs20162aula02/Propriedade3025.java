/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.marcosmathias.cs20162aula02;

/**
 * Implementação do cálculo da propriedade 3025.
 *
 * @author Marcos Mathias Pereira
 *
 */

public final class Propriedade3025 {
	/**
     * Verifica se um número é válido para a propriedade 3025, de acordo com a fórmula: 
     * ab+cd = e
     * e^2 = abcd
     * 
     * @param n O numero a ser verificado.
     *
     * @return A resposta se o número é ou não é válido para a propriedade 3025 (true or false)

     * @throws IllegalArgumentException Se o número a ser verificado for menor do que zero ou maior do que 9999.
     */
	public static boolean propriedade3025(int n){
		if(0 <= n && n <= 9999){
			int i = n/100;
			int j = n%100;
			return (i+j)*(i+j)==n;	
		}
		else
			throw new IllegalArgumentException("Entrada inválida. Digite um número 0 e 9999.");	
	}
}