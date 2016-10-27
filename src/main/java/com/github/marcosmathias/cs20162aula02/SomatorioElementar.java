package com.github.marcosmathias.cs20162aula02;

public class SomatorioElementar {
	public static int SomaNaturais(int n){
		if(1 <= n){
			int i = 1;
			int s = 0;
			int d = 0;
			while(i <= n){
				d = 1 + (i * i);
				s = s + (1 / d);
			}
			return s;
		}
		else
			throw new IllegalArgumentException("Número inválido. Selecione um número maior ou igual a 1.");
	}
}
