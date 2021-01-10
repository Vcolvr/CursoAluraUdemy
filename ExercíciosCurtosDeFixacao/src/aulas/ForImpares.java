package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ForImpares {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Ate que numero devo descobrir seus impares? ");
			int x = sc.nextInt();
			int i = 0;
					
				for ( i = 0 ; i <= x ; i++ ) {
			
					if ( i % 2 != 0 ) {
						System.out.printf("%d ", i);
					}
					sc.close();
				}
				
}
}