package aulas;

import java.util.Locale;
import java.util.Scanner;

public class CoordenadasAtéNula {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a coordenada X:");
		double x = sc.nextDouble();
		System.out.println("Digite a coordenada Y:");
		double y = sc.nextDouble();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Q1");
			}

			else if (x < 0 && y > 0) {
				System.out.println("Q2");
			}

			else if (x < 0 && y < 0) {
				System.out.println("Q3");
			}

			else if (x > 0 && y < 0) {
				System.out.println("Q4");
			}
			System.out.println();
			System.out.println("O programa encerrará caso X e Y = 0");
			System.out.println();
			System.out.println("Digite a coordenada X:");
			x = sc.nextDouble();
			System.out.println("Digite a coordenada Y:");
			y = sc.nextDouble();
		}
		sc.close();

	}
}