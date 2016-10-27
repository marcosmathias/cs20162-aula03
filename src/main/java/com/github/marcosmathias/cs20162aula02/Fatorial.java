package com.github.marcosmathias.cs20162aula02;

public class Fatorial {
	public static int Fator(int n){
		
		if(1 <= n){
			int i = 2;
			int f = 1;
			while (i <= n){
				f = f * i;
				i = i + 1;
			}
			return f;
		}
		
		else
			throw new IllegalArgumentException("Número inválido. Selecione um número maior ou igual a 1.");
	}
}
