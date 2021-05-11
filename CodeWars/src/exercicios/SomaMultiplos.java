package exercicios;

public class SomaMultiplos {
	public static int sumOfMultiples(int m, int n, int i) {
		int soma = 0;

		for(int c = m; c <= n; c++) {
			if(c % i == 0) {
				soma = soma + c;
			}
		}
		
		return soma;
		
	}
}
