package com.teste;

public class ContaLanchonete {
	public double precoAPagar(int codigo, int quantidade) {
		double total = 0;
		if (codigo == 1) {
			total = quantidade * 4.0;
		}

		else if (codigo == 2) {
			total = quantidade * 4.5;
		}

		else if (codigo == 3) {
			total = quantidade * 5.0;
		}

		else if (codigo == 4) {
			total = quantidade * 2.0;
		}

		else if (codigo == 5) {
			total = quantidade * 1.5;
		}

		else {
			System.out.println("ERROR");
		}
		return total;
	}
}
