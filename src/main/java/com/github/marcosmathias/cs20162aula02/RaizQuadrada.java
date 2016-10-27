package com.github.marcosmathias.cs20162aula02;

public class RaizQuadrada {
	public static int Raiz(int n, int i){
		if(0 < n){
			int r = 1;
			
			while(0 <= i){
				r = (r + (n / r)) / 2;
				i = i - 1;
			}
			
			return r;
		}
		else
			throw new IllegalArgumentException("Valor do primeiro número (n) inválido. O número deve ser maior do que 0.");
		
	}
}
