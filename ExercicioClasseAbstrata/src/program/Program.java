package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		List<Pessoa> pessoas = new ArrayList<>();
		
		for(int i = 1 ; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.println("Individual or Company (i/c)?");
			char response = sc.next().charAt(0);
			System.out.println("What's your name? ");
			String name = sc.next();
			System.out.println("What's your anual income? ");
			double anualIncome = sc.nextDouble();
			if(response == 'i') {
				System.out.println("What's your Health Expenditures?");
				double healthExpenditures = sc.nextDouble();
				PessoaFisica fPessoa = new PessoaFisica(name, anualIncome, healthExpenditures);
				pessoas.add(fPessoa);
			}
			else {
				System.out.println("What's the number of employees? ");
				int numberEmployees = sc.nextInt();
				PessoaJuridica jPessoa = new PessoaJuridica(name, anualIncome, numberEmployees);
				pessoas.add(jPessoa);
			}
		}
		for(Pessoa p : pessoas) {
			System.out.println(p.getName() + ": $ " + String.format("%.2f", p.imposto()));
		}
		sc.close();
	}
}
