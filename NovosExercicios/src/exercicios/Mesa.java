package exercicios;

import java.util.Scanner;

public class Mesa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b + c && b < a + c && c < a + b) {
			if(a==b && b==c) {
				System.out.println("Tri�ngulo equilatero");
			}
			else {
				if (a == b || b ==c || a == c) {
					System.out.println("Tri�ngulo Isosceles");
				}
				else {
					System.out.println("Tri�ngulo Escaleno");
				}
			}
		}
		else {
			System.out.println("N�o � poss�vel formar um tri�ngulo");
		}
	}
}
