package aulas;

import java.util.Locale;
import java.util.Scanner;

public class exercicioCaixa {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Qual o codigo do produto?");
			int codigo1 = sc.nextInt();
			System.out.println("Quantas unidades serao compradas?");
			int numero1 = sc.nextInt();
			System.out.println("Qual o valor por unidade?");
			double valor1 = sc.nextDouble();
			
			double subtotal1 =  numero1 * valor1;
			System.out.printf("Codigo %d, Subtotal = %.2f%n", codigo1, subtotal1);
			System.out.println();
			
			System.out.println("Qual o codigo do produto?");
			int codigo2 = sc.nextInt();
			System.out.println("Qual o valor por unidade?");
			int numero2 = sc.nextInt();
			System.out.println("Qual o valor por unidade?");
			double valor2 = sc.nextDouble();
			double subtotal2 = numero2 * valor2;
			System.out.printf("Codigo %d, Subtotal = %.2f%n", codigo2, subtotal2);
			
			double total = subtotal1 + subtotal2;
			
			System.out.println();
			System.out.printf("O total sera de %.2f%n", total);
			
			sc.close();
			
	}

}
