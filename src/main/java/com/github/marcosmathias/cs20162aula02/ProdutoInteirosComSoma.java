/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.marcosmathias.cs20162aula02;

/**
 * Implementação do cálculo do produto de dois inteiros positivos.
 *
 * @author Marcos Mathias Pereira
 *
 */

public final class ProdutoInteirosComSoma {
	public static int Produto(int a, int b){
		
		/**
	     * Obtém o produto de dois inteiros positivos.
	     * 
	     * @param a Um numero inteiro positivo.
	     * @param b Um outro numero inteiro positivo.
	     *
	     * @return O valor do produto.

	     * @throws IllegalArgumentException Se o primeiro ou segundo número digitados não forem inteiros positivos.
	     */
		
		if(1>a)
			throw new IllegalArgumentException("O primeiro número digitado é inválido.");
		
		else if(1>b)
			throw new IllegalArgumentException("O segundo número digitado é inválido.");
		
		else{
		
			int totalParcelas = a;
			int parcela = b;
			
			if(b<a){
				totalParcelas = b;
				parcela = a;
			}
			
			int i=1;
			int s=0;
			
			
			
			while(i<=totalParcelas){
				s=s+parcela;
				i=i+1;
			}
			
			return s;
		}
	}
}