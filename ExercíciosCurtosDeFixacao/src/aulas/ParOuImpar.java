package aulas;

import java.util.Locale;
import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite o numero a ser analizado: ");
			int A = sc.nextInt();
					
			if ( A % 2 == 0) {
			System.out.println("PAR");
			}
			
			else
			System.out.println("IMPAR");
			
				
			sc.close();
			
	}

}
