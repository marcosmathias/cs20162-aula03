/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


package com.github.marcosmathias.cs20162aula02;

/**
 * Implementação do cálculo do Maior Divisor Comum (MDC) entre dois números, utilizando 
 * um método sem recursão, e um outro método utilizando somente subtrações.
 *
 * @author Marcos Mathias Pereira
 *
 */

public final class MaiorDivisorComum {
	
	/**
     * Verifica o Maior Divisor Comum (MDC) entre dois números, sem utilizar recursão.
     * 
     * @param a O primeiro número a se verificar.
     * @param b O segundo número a se verificar.
     *
     * @return O Maior Divisor Comum entre esses dois números.

     * @throws IllegalArgumentException Se o valor de b for menor do que 0, ou se o valor de b for menor que o valor de a.
     */
	
	public static int CrivoEratostenes(int a, int b){
		
		if(b <= a && 0 < b){
			int m;
			
			while(b != 0){
				m = a % b;
				a = b;
				b = m;
			}
			
			return a;
		}
		
		else
			throw new IllegalArgumentException("O valor do segundo número (b) é inválido. Digite um valor maior do que 0, e maior do que o primeiro número.");
	}
	
	/**
     * Verifica o Maior Divisor Comum (MDC) entre dois números, utilizando somente subtrações.
     * 
     * @param a O primeiro número a se verificar.
     * @param b O segundo número a se verificar.
     *
     * @return O Maior Divisor Comum entre esses dois números.

     * @throws IllegalArgumentException Se o valor de b for menor do que 0, ou se o valor de b for menor que o valor de a.
     */
	
	public static int CrivoEratostenesSubtracoes(int a, int b){
		
		if(b <= a && 0 < b){
			
			while(a != b){
				if(a > b){
					a = a - b;
				}
				else{
					b = b - a;
				}
			}
			
			return a;
		}
		else
			throw new IllegalArgumentException("O valor do segundo número (b) é inválido. Digite um valor maior do que 0, e maior do que o primeiro número.");
	}
}