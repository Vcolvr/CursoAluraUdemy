package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		// Este programa le uma conta de uma pessoa, e permite retiradas de dinheiro com defesa de exceptions.
		Locale.setDefault(Locale.US);
		try {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data:");
		System.out.println("What's the number?");
		int numberAccount = sc.nextInt();
		System.out.println("What's the holder's name?");
		String accountHolder = sc.next();
		System.out.println("What's their Initial Balance?");
		double initialBalance = sc.nextDouble();
		System.out.println("What's their Withdraw Limit?");
		double withdrawLimit = sc.nextDouble();
		Account account = new Account(numberAccount, accountHolder, initialBalance, withdrawLimit);
		
		System.out.println();
		System.out.println(account);
		sc.close();
		}catch (RuntimeException e) {
			System.out.println("Unexpected Error");
		}
	}

}
