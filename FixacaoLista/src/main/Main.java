package main;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entidades.Entidades;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos empregados serão registrados?");
		int n = sc.nextInt();
		
		List<Entidades> list = new ArrayList<>();

		
		
		for(int i = 0; i < n ; i++) {
			sc.hasNextLine();
			System.out.println("Funcionário #" + (i+1) +  ":");
			System.out.println("Insira o ID:");
			Integer id = sc.nextInt();
			System.out.println("Insira o nome:");
			String nome = sc.next();
			System.out.println("Insira o salario:");
			double salario = sc.nextDouble();
			
			Entidades emprego = new Entidades(id, nome, salario);
			list.add(emprego);
		}
		
		System.out.println("Insira o ID do funcionario com aumento salarial");
		int funcionario = sc.nextInt();
		Entidades emprego = list.stream().filter(x -> x.getId() == funcionario).findFirst().orElse(null);
		//pode ser feito com: int pos = posicao(list, funcionario);
		//if (pos == -1 || null) {
		if (emprego == null) {
			System.out.println("O ID nao existe!");
		}
		else {
			System.out.println("Qual é a porcentagem do aumento?");
			double aumento = sc.nextDouble();
			emprego.aumento(aumento);
			//list.get(pos).aumento(aumento);
		}
		
		sc.nextLine();
		System.out.println("Lista de funcionarios:");
		
		for (Entidades e: list) {
		//for(Entidades emprego : list) {
		//	System.out.println(emprego);
			System.out.println(e);
		}
		sc.close();
		
	}
	public static int posicao(List<Entidades> list, int id) {
		for (int i=0 ; i<list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}
}