package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Intervalos {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Qual numero sera analisado?");
			double numero = sc.nextDouble();
			
				
			if (numero < 0.00 || numero > 100.00) {
				System.out.println("Fora de intervalo");
			}
			
			else if (numero >= 0.00 && numero < 25.00) {
				System.out.println("Intervalo [25, 50]");
			}
			
			else if (numero >= 25.00 && numero < 50.00) {
				System.out.println("Intervalo [25, 50]");
			}
			
			else if (numero >= 50.00 && numero < 75.00) {
				System.out.println("Intervalo [50, 75]");
			}
			
			else if (numero >= 75.00 && numero <= 100.00) {
				System.out.println("Intervalo [75, 100]");
			}
			
			sc.close();
	}
	
}