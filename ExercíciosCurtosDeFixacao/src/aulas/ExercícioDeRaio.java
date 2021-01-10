package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ExercícioDeRaio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		Double raio = sc.nextDouble();
		
		
		Double Area = 3.14159 * (raio * raio);
		
		System.out.printf("A area desse circulo mede: %.4f%n", Area);
		
		sc.close();
	}

}
