package aulas;

import java.util.Scanner;

public class Exerc�ciodeSoma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro algarismo: ");
		int A = sc.nextInt();
		System.out.println("Digite o segundo algarismo: ");
		int B = sc.nextInt();
		
		int SOMA = A + B;
		
		System.out.println("O resultado �: " + SOMA);
		sc.close();
		
				}

}
