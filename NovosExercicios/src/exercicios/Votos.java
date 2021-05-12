package exercicios;

import java.util.Scanner;

public class Votos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, escreva o total de pessoas");

		int total = sc.nextInt();

		System.out.println("Por favor, escreva o total votos brancos");

		int brancos = sc.nextInt();

		double porcentagemDeBrancos = brancos*100/total;

		System.out.println("Por favor, escreva o total nulos");
		
		int nulos = sc.nextInt();

		double porcentagemDeNulos = nulos*100/total;

		System.out.println("Por favor, escreva o total validos");
		
		int validos = sc.nextInt();
		
		double porcentagemDeValidos = validos*100/total;
		
		if(validos + nulos + brancos != total) {
			System.out.println("As somas das partes não equivalem ao total. Reinicie o aplicativo");
		}
		else {
			System.out.println("O total de votos foi de " + total);
			System.out.println("O total de votos brancos foi de " + porcentagemDeBrancos);
			System.out.println("O total de votos nulos foi de " + porcentagemDeNulos);
			System.out.println("O total de votos validos foi de " + porcentagemDeValidos);
		}
		
	}

}
