package com.github.marcosmathias.cs20162aula02;

public class ValorDePi {
	public static int Pi (int n){
		if(1 <= n){
			int i = 1;
			int s = -1;
			int d = -1;
			int p = 0;
			while(i <= n){
				d = d + 2;
				s = -1 * s;
				p = p + (4 * (s / d));
				i = i + 1;
			}
			return p;
		}
		else
			throw new IllegalArgumentException("Número inválido. Selecione um número maior ou igual a 1.");
	}
	
}
