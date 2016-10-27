/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.marcosmathias.cs20162aula02;


/**
 * Implementação do cálculo do Crivo de Eratóstenes, que verifica se dado número é primo ou não.
 *
 * @author Marcos Mathias Pereira
 *
 */

public final class CrivoDeEratostenes {
	
	/**
     * Verifica se um número é primo ou não, utilizando, para isso, o Crivo de Eratóstenes.
     * 
     * @param a[] O vetor que será utilizado para indicar quais números são primos, e quais não são.
     * @param n O número que se deseja verificar.
     *
     * @return O resultado da verificação.

     * @throws IllegalArgumentException Se o valor n for menor ou igual a 1.
     * @throws IllegalArgumentException Se o vetor a[] não estiver vazio.
     */
	
	public static boolean CrivoEratostenes(int a[], int n){
		if(n>1){
			int k;
			for(k=2; k<=n; k++){
				if(a[k]!=0)
					throw new IllegalArgumentException("O vetor não está vazio. Esvazie o vetor e tente novamente.");
			}
				int i = 2;
				int c;
				while(i <= (n / 2)){
					if(a[i]==0){
						c = i + i;
						while(c <= n){
							a[c] = 1;
							c = c+i;
						}
					}
					i = i+1;
				}
				if(a[n] == 0)
					return true;
				else
					return false;
		}
		else
			throw new IllegalArgumentException("O número a ser verificado é inválido. Entre com um número maior do que 1.");
			
	}
}