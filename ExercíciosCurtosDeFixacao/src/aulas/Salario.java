package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Qual o nome do funcionario? ");
		String nome = sc.next();
		System.out.println("Qual o numero de identificacao desse funcionario?");
		int numero = sc.nextInt();
		System.out.println("Quantas horas ele trabalhou esse mês?");
		int horas = sc.nextInt();
		System.out.println("Quanto ele ganha por hora?");
		double horadeServico = sc.nextDouble();
		
		
		double salario = horas * horadeServico;
		
		System.out.printf("O funcionario %s de numero %d tera o salario de %.1f%n", nome, numero, salario);
		sc.close();

	}

}
