package main;

import java.util.Locale;
import java.util.Scanner;
import util.Calculator;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What's the dollar price?");
		double cotacao = sc.nextDouble();

		System.out.println("How many dollars will be bought?");
		double dolares = sc.nextDouble();

		Calculator calculo = new Calculator(cotacao, dolares);

		System.out.println(calculo);
		sc.close();
	}

}
