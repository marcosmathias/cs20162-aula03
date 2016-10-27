/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.marcosmathias.cs20162aula02;

/**
 * Implementação da verificação de número primo.
 *
 * @author Marcos Mathias Pereira
 *
 */

public final class NumeroPrimo {
	
	/**
     * Verifica se dado número é primo.
     * 
     * @param n O número a ser verificado.
     *
     * @return O resultado dessa verificação. Se true, o número é primo. Se false, o número não é primo.

     * @throws IllegalArgumentException Se o número n não for maior que 1.
     */
	
	public static boolean Primo(int n){
		
		if(n > 1){
			int i = 2;
			
			while(i <= (n - 1)){
				if(n % i == 0){
					return false;
				}
				i = i + 1;
			}
			
			return true;
		}
		
		else
			throw new IllegalArgumentException("Digite um valor maior do que 1.");
	}
}