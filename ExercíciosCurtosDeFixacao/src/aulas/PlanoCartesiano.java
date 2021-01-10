package aulas;

import java.util.Locale;
import java.util.Scanner;

public class PlanoCartesiano {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Insira a coordenada X: ");
			double x = sc.nextDouble();
			System.out.println("Insira a coordenada Y: ");
			double y = sc.nextDouble();
			
			
			if ( x == 0 && y == 0 ) {
				System.out.println("Origem");
			}
			
			if ( x == 0 && y != 0 ) {
				System.out.println("Eixo Y");
			}
			
			if ( x != 0 && y == 0 ) {
				System.out.println("Eixo X");
			}
			
			if ( x > 0 && y > 0 ) {
				System.out.println("Q1");
			}
			
			if ( x < 0 && y > 0 ) {
				System.out.println("Q2");
			}
			
			if ( x < 0 && y < 0 ) {
				System.out.println("Q3");
			}
			
			if ( x > 0 && y < 0 ) {
				System.out.println("Q4");
			}
			
			sc.close();
			
	}
}
