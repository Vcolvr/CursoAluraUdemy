package exercicios;

import java.util.Scanner;

public class CelsiusParaF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, insira a temperatura em Celsius");
		
		int Celsius = sc.nextInt();
		
		int Fahrenheit = (Celsius * 9/5) + 32;

		System.out.println();
		System.out.println("Convertido para Fahrenheit é igual a " + Fahrenheit);
		
		sc.close();
	}

}
