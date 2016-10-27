/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.marcosmathias.cs20162aula02;

/**
 * 
 * Implementação do cálculo da propriedade 153.
 * 
 * @author Marcos Mathias Pereira
 *  
 */

public final class Propriedade153 {
	public static boolean propriedade153(int n){
		/**
		 * Verifica se um número é válido para a propriedade 153.
		 * 
		 * Fórmula da propriedade:
		 * a^3 + b^3 + c^3 = abc
		 * 
		 * @param n O número a ser verificado.
		 * 
		 * @return A resposta se o número é ou não é válido para a propriedade 3025 (true or false)
		 * 
		 * @throws IllegalArgumentException Se o valor a ser verificado for menor do que 0 ou maior do que 9999.
		 */
		
		if(0<=n && n<=9999){
			int i = n/100;
			int j = (n-100*i)/10;
			int k = n%10;
			return (Math.pow(i, 3)+Math.pow(j, 3)+Math.pow(k, 3)) == n;
		}
		else
		throw new IllegalArgumentException("O número digitado é inválido para esta operação. Digite um número entre 0 e 9999.");
	}

}