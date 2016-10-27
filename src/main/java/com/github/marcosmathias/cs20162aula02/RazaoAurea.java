package com.github.marcosmathias.cs20162aula02;

public class RazaoAurea {
	public static double Razao(int x, int y, int k){
		
		if(0 <= x){
			
			if(x < y){
				
				if(0 < k){
					int c = y;
					int a = x;
					int i = 1;
					
					while(i <= k){
						int t = c;
						c = c + a;
						a = t;
						i = i + 1;
					}
					
					return c/a;
				}
				else
					throw new IllegalArgumentException("Valor do terceiro número (k) inválido. k deve ser maior do que 0.");
				
			}
			else
				throw new IllegalArgumentException("Valor do segundo número (y) inválido. y deve ser maior do que  o primeiro número (x).");
			
		}
		
		else
			throw new IllegalArgumentException("Valor do primeiro número (x) inválido. x deve ser maior ou igual a 0.");
	}

}
