package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Ola, posso descobrir se dois numeros sao multiplos");
		System.out.println("Digite o primeiro numero: ");
		int a = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		int b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
			sc.close();
		}
	}
}
