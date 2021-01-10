package aulas;
import java.util.Locale;
import java.util.Scanner;

public class Potenciasfor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mostraremos o quadrado e o cubo de numeros ate esse: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {		
			System.out.printf("%d  ", i);
			System.out.print(i * i + "  ");
			System.out.println(i * i * i + "  ");
			
		}
		sc.close();

	}

}

