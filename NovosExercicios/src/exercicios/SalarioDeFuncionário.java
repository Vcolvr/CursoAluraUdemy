package exercicios;

import java.util.Scanner;

public class SalarioDeFuncion�rio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o sal�rio do funcion�rio que receber� aumento:");
		
		double salario = sc.nextDouble();
		
		System.out.println();
		System.out.println("Insira a porcentagem de aumento:");
		
		double aumento = sc.nextDouble();
		
		double novoSalario = salario * (1 + aumento/100);
		
		System.out.println();
		System.out.println("O novo sal�rio ser� de " + novoSalario);

	}

}
