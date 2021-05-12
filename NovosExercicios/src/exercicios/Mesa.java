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
				System.out.println("Triângulo equilatero");
			}
			else {
				if (a == b || b ==c || a == c) {
					System.out.println("Triângulo Isosceles");
				}
				else {
					System.out.println("Triângulo Escaleno");
				}
			}
		}
		else {
			System.out.println("Não é possível formar um triângulo");
		}
	}
}
