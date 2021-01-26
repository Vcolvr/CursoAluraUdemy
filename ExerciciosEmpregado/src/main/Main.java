package main;

import java.util.Locale;
import java.util.Scanner;

import entidades.Empregado;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Empregado empregado = new Empregado();

		System.out.println("Digite o nome do funcionário: ");
		empregado.nome = sc.next();
		System.out.println("Digite o salário do funcionário: ");
		empregado.salarioBruto = sc.nextDouble();
		System.out.println("Digite o imposto sobre esse salário: ");
		empregado.imposto = sc.nextDouble();
		System.out.printf("Empregado: %s,%n", empregado);

		System.out.println("Qual a porcentagem de aumento de salário?");
		double aumento = sc.nextDouble();
		empregado.aumentarSalario(aumento);

		System.out.print(empregado);

		sc.close();
	}

}
