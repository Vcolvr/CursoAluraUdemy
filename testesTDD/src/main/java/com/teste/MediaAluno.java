package com.teste;

public class MediaAluno {
	
	public double calcularMedia(double... nota) {
		double resultado = 0;
		double divisor = 0;
		
		for(double e: nota) {
			resultado = resultado + e;
			divisor++;
		}
		
		resultado = resultado / divisor;
		
		return resultado;
	}

}
