package aulas;

import java.util.Scanner;

public class SomaDeVarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcularei A * B - C * D");
		System.out.println("Digite o valor de A");
		int A = sc.nextInt();
		System.out.println("Digite o valor de B");
		int B = sc.nextInt();
		System.out.println("Digite o valor de C");
		int C = sc.nextInt();
		System.out.println("Digite o valor de D");
		int D = sc.nextInt();
		
		int DIFERENCA = A * B - C * D;
		
		System.out.print("A diferenca e: " + DIFERENCA);

		sc.close();
 }}
