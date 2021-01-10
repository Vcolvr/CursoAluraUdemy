package main;

import java.util.Locale;
import java.util.Scanner;
import entidades.Clientes;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quartosTotais = 10;
		System.out.println("Quantas salas serão alugadas?");
		int n = sc.nextInt();

		Clientes[] cliente = new Clientes[quartosTotais];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Insira o nome do alugador");
			String nome = sc.nextLine();

			System.out.println("Insira o email do alugador");
			String email = sc.nextLine();

			System.out.println("Insira o quarto do alugador");
			int quarto = sc.nextInt();

			cliente[quarto] = new Clientes(nome, email);
		}

		for (int i = 0; i < quartosTotais; i++) {
			if (cliente[i] != null) {
				System.out.println("Quarto #" + i);
				System.out.println(cliente[i]);
			}
		}
		sc.close();
	}
}
