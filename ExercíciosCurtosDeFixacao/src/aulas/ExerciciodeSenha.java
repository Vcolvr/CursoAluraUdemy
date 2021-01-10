package aulas;

import java.util.Scanner;

public class ExerciciodeSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		
		while ( senha != 2022 ) {
			System.out.println("Insira sua senha: ");
			senha = sc.nextInt();
			System.out.println("Senha invalida");
		}
		System.out.println();
		System.out.println("Acesso permitido");
		sc.close();
		
	}

}
