package aulas;

import java.util.Locale;
import java.util.Scanner;

public class DuracaodoJogo {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Em que horario comecou o jogo?");
			int comeco = sc.nextInt();
			System.out.println("Em que horario terminou o jogo?");
			int fim = sc.nextInt();
			
			int duracao = comeco - fim;
			
			if (comeco == fim ) {
				System.out.println("O jogo durou 24 horas");
			}
			
			else if ( comeco < fim) {
				duracao = comeco - fim;
				System.out.println("O jogo durou " + duracao + " hora(s)");
			}
			
			else if ( comeco > fim ) {
				duracao = (24 - comeco) + fim;
				System.out.println("O jogo durou " + duracao + " hora(s)");
			}
			
			
			
			
			
			
			sc.close();
			
	}		
}