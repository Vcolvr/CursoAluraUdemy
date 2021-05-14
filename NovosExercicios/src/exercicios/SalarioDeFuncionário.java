package exercicios;

import java.util.Scanner;

public class SalarioDeFuncionário {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o salário do funcionário que receberá aumento:");
		
		double salario = sc.nextDouble();
		
		System.out.println();
		System.out.println("Insira a porcentagem de aumento:");
		
		double aumento = sc.nextDouble();
		
		double novoSalario = salario * (1 + aumento/100);
		
		System.out.println();
		System.out.println("O novo salário será de " + novoSalario);

	}

}
