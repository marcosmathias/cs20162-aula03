package com.github.marcosmathias.cs20162aula02;

public class RestoDivisao {
	public static int Mod(int x, int y){
		
		if(0 <= y){
			
			if(0 < x){
				int s = x;
				
				while(y <= s){
					s = s - y;
				}
				
				return s;
			}
			else
				throw new IllegalArgumentException("Valor do primeiro número (x) inválido. O número deve ser maior do que 0.");
			
		}
		else
			throw new IllegalArgumentException("Valor do segundo número (y) inválido. O número deve ser maior ou igual a 0.");
	}

}
