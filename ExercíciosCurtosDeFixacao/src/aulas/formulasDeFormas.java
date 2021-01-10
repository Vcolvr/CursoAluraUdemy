package aulas;

import java.util.Locale;
import java.util.Scanner;

public class formulasDeFormas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Realizarei as seguintes contas:\r\n" + "			Triangulo = A * C / 2;\r\n"
				+ "		    	Circulo = C * C * 3.14159;\n" + "			Trapezio = (A + B) * C /2;\r\n"
				+ "			Quadrado = B * B;\r\n" + "			Retangulo = A * B;");

		System.out.println("Digite o valor de A:");
		double A = sc.nextDouble();
		System.out.println("Digite o valor de B:");
		double B = sc.nextDouble();
		System.out.println("Digite o valor de C:");
		double C = sc.nextDouble();

		double triangulo = A * C / 2;
		double circulo = C * C * 3.14159;
		double trapezio = (A + B) * C / 2;
		double quadrado = B * B;
		double retangulo = A * B;

		System.out.printf("Triangulo: %.3f%n", triangulo);
		System.out.printf("Circulo: %.3f%n", circulo);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("retangulo: %.3f%n", retangulo);

		sc.close();
	}

}
