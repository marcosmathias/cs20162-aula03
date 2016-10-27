package com.github.marcosmathias.cs20162aula02;

public class QuadradoPerfeito {
	public static boolean Quadrado(int k){
		if(1 <= k){
			int i = 1;
			int q = 1;
			
			while(q < k){
				i = i + 2;
				q = q + i;
			}
			
			return q == k;
		}
		else
			throw new IllegalArgumentException("Valor inválido. Selecione um número maior ou igual a 1.");
	}

}
