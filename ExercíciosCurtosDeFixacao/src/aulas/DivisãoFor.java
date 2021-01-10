package aulas;

import java.util.Scanner;
import java.util.Locale;

public class DivisãoFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você quer dividir quantos numeros?");
		int N = sc.nextInt();
		System.out.println();

		for (int i = 0; i < N; i++) {
			System.out.println("Insira o numerador: ");
			double numerador = sc.nextDouble();
			System.out.println("Insira o denominador: ");
			double denominador = sc.nextDouble();

			if (denominador == 0) {
				System.out.printf("Divisao impossivel%n");
				System.out.println();
			}

			else {
				double divisao = numerador / denominador;
				System.out.printf("Resultado: %.2f%n", divisao);
				System.out.println();
			}
		}
		sc.close();

	}
}
