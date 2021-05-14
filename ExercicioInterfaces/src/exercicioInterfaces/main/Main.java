package exercicioInterfaces.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exercicioInterfaces.entities.Contratos;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double total = 0;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.println("Digite as informações do contrato ");
			System.out.println("Número: ");
			int numero = sc.nextInt();
			System.out.println("\nData (dd/MM/yyyy): ");
			Date data = sdf.parse(sc.next());
			System.out.println("\nValor do contrato: ");
			double valor = sc.nextDouble();
			Contratos contrato = new Contratos(numero, data, valor);
			System.out.println("\nQual a quantidade de parcelas?");
			int parcelas = sc.nextInt();
			
			for(int i = 0; i < parcelas; i++) {
				System.out.println("\nQuota #" + ( i + 1 ) );
				contrato.mesesDoContrato();
				System.out.println("Data de vencimento: " + sdf.format(contrato.getDataDoContrato()));
				contrato.parcela(( i + 1 ), parcelas);
				System.out.print("Valor da parcela: ");
				contrato.imprimirValor(i);
			}
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
