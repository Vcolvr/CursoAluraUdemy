package main;

import java.util.Locale;
import java.util.Scanner;

import entidades.Clientes;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Clientes cliente;

		System.out.println("Digite o numero da conta:");
		int numeroDaConta = sc.nextInt();
		System.out.println("Digite o nome do dono da conta:");
		String nomeDoDono = sc.next();
		System.out.println("Existe um deposito inicial? (S/N)");
		char resposta = sc.next().charAt(0);

		if (resposta == 'S' || resposta == 's') {
			System.out.println("Digite o valor do deposito inicial:");
			double saldo = sc.nextDouble();
			cliente = new Clientes(numeroDaConta, nomeDoDono, saldo);
		} else {
			cliente = new Clientes(numeroDaConta, nomeDoDono);
		}

		System.out.println();
		System.out.println("Informacoes da conta:");
		System.out.println(cliente);

		System.out.println("Digite o valor do deposito:");
		double deposito = sc.nextDouble();
		cliente.deposito(deposito);
		System.out.println("Informacoes atualizadas da conta:");
		System.out.println(cliente);

		System.out.println("Digite o valor de retirada");
		double retirada = sc.nextDouble();
		cliente.retirada(retirada);
		System.out.println("Informacoes atualizadas da conta:");
		System.out.println(cliente);

		sc.close();
	}

}
