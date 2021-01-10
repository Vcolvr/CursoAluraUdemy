package aulas;

import java.util.Locale;
import java.util.Scanner;

public class negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero a ser analisado: ");
		int inteiro = sc.nextInt();

		if (inteiro < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}

		sc.close();

	}

}
