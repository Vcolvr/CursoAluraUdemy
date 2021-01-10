package aulas;

import java.util.Locale;
import java.util.Scanner;

public class DivisoresFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você quer saber os divisores de que numero?");
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			if (N % i == 0)
				System.out.print(i + " ");
		}

		sc.close();

	}

}
