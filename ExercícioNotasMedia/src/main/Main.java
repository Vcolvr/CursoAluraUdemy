package main;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("What's the student's name?");
		aluno.nome = sc.next();
		System.out.println("What's the grade of the first test?");
		aluno.nota1 = sc.nextDouble();

		System.out.println("What's the grade of the second test?");
		aluno.nota2 = sc.nextDouble();

		System.out.println("What's the grade of the third test?");
		aluno.nota3 = sc.nextDouble();

		System.out.println();
		System.out.println(aluno);

		if (aluno.media() < 60.0) {
			System.out.println("Failed");
			double pontos = 60 - aluno.media();
			System.out.printf("Missing %.2f points", pontos);
		}

		else {
			System.out.println("Succeeded!");
		}

		sc.close();
	}
}
