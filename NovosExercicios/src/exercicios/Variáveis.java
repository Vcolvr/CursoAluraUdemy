package exercicios;

import java.util.Scanner;

public class Variáveis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int y = sc.nextInt();
		
		int z = (x*y) + 5;
		
		if(z<= 0) {
			System.out.println("A");
		}
		else {
			if(z<= 100) {
				System.out.println("B");
			}
			else {
				System.out.println("C");
			}
		}
		System.out.println(z);
	}

}
