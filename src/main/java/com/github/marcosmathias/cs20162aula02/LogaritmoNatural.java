package com.github.marcosmathias.cs20162aula02;

public class LogaritmoNatural {
	public static double Logaritmo(double n, double k){
		
		if(1 <= n){
			
			if(2 <= k){
				int i = 2;
				double e = n + 1;
				
				while (i <= k){
					double p = Math.pow(n, i);
					double f = Fatorial.Fator(i);
					e = e + (p / f);
					i = i + 1;					
				}
				
				return e;
			}
			else
				throw new IllegalArgumentException("O segundo número é inválido. Selecione um número menor ou igual a 2.");
				
		}
		else
			throw new IllegalArgumentException("O segundo número é inválido. Selecione um número menor ou igual a 1.");
		
	}
}
