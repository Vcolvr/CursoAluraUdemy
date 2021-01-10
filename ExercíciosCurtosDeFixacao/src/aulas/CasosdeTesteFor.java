package aulas;

import java.util.Locale;
import java.util.Scanner;

public class CasosdeTesteFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Quantos alunos serao registrados?");
			int N = sc.nextInt();

			double prova2 = 0;
			double prova3 = 0;
			double prova5 = 0;

			double media = (prova2 * 2 + prova3 * 3 + prova5 * 5) / 10;

			int i = 0;

			for (i = 0; i < N; i++) {
				prova2 = sc.nextDouble();
				prova3 = sc.nextDouble();
				prova5 = sc.nextDouble();
				media = (prova2 * 2 + prova3 * 3 + prova5 * 5) / 10;

				System.out.printf("%.1f%n", media);
			}
		}

	}

}