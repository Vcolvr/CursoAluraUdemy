package aulas;

import java.util.Locale;
import java.util.Scanner;

public class AlgoritmoDePosto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas avaliacoes vao ser registradas?");
		int x = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (x != 4) {

			if (x == 1) {
				alcool += 1;
			}

			if (x == 2) {
				gasolina += 1;
			}

			if (x == 3) {
				diesel += 1;
			}

			x = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
		sc.close();

	}
}