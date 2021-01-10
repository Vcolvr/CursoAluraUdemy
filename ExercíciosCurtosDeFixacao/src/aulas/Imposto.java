package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual seu salario?");
		double renda = sc.nextDouble();
		double imposto = 0;

		if (renda < 0) {
			System.out.println("Erro");
		}

		else if (renda > 0.0 && renda < 2000.01) {
			System.out.println("Voce esta isento de imposto de renda");
		}

		else if (renda > 2000.00 && renda < 3000.01) {
			imposto = (renda - 2000) * 0.08;
			System.out.printf("R$: %.2f%n", imposto);
		}

		else if (renda > 3000.00 && renda < 4500.01) {
			imposto = (renda - 3000) * 0.18 + 1000 * 0.8;
			System.out.printf("R$: %.2f%n", imposto);
		}

		else if (renda > 4500) {
			imposto = (renda - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.8;
			System.out.printf("R$: %.2f%n", imposto);
		}

		sc.close();
	}
}
