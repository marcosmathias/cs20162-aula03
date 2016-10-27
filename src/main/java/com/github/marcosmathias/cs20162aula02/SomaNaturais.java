/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.marcosmathias.cs20162aula02;

/**
 * Implementação do cálculo da soma vários de números naturais.
 *
 * @author Marcos Mathias Pereira
 *
 */

public final class SomaNaturais {
	
	
	public static int somaNaturais(int n){
		
		/**
	     * Obtém a soma de uma quantidade de números naturais.
	     * 
	     * @param n A quantidade de números naturais que se deseja somar, à partir de 1. 
	     * Ex: Se desejamos somar os 5 primeiros números naturais, n=5.
	     *
	     * @return O valor da soma.

	     * @throws IllegalArgumentException Se a quantidade de números naturais não for um número natural.
	     */
		
		
		if(n<1)
		throw new IllegalArgumentException("O número deve ser natural");
		else{
			int i=2;
			int s=1;
			
			while (i<=n){
				s=s+i;
				i++;
			}
			
			return s;
		}
	}
}