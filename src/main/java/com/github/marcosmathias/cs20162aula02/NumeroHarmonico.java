/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.marcosmathias.cs20162aula02;

/**
 * Implementação do cálculo do número harmônico de ordem n.
 *
 * @author Marcos Mathias Pereira
 *
 */

public final class NumeroHarmonico {
	
	/**
     * Verifica qual o número harmônico de ordem n.
     * 
     * @param n A ordem do número harmônico de que queremos saber o valor.
     *
     * @return O número harmônico desejado.

     * @throws IllegalArgumentException Se o valor de n for menor do que 1.
     */
	
	public static double numeroHarmonico(double n){
		
		if(1 <= n){
			int i = 1;
			int s = 0;
			while(i <= n){
				s = s + (1/i);
				i = i + 1;
			}
		return s;
		}			
		else
			throw new IllegalArgumentException("Selecione um número real maior do que 0.");
	}

}