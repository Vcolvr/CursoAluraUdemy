package aulas;

import java.util.Locale;
import java.util.Scanner;

public class FatoriaisFor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Voce deseja saber a fatorial de que numero?");
		int n = sc.nextInt();
		int fatorial = 1;
		
		for (int i = 1; i <= n; i++){
			
			fatorial = fatorial * i;
		}
		System.out.println(fatorial);
				
		
		sc.close();


	}

}
