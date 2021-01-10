package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Intervalo1020For {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers will be analysed?");
		int N = sc.nextInt();

		int x = 0;
		int i = 0;

		int in = 0;
		int out = 0;
		System.out.println();

		for (i = 0; i < N; i++) {
			if (i == 0) {
				System.out.println("Insert the first number");
			} else {
				System.out.println("Insert the next number");
			}
			x = sc.nextInt();

			if (x > 9 && x < 21) {
				in = in + 1;
			}

			else {
				out = out + 1;
			}
			System.out.println();
		}
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out);
		sc.close();
	}
}
