package exercicioFile.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import exercicioFile.entities.Product;

public class Main {

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		String path = "C:\\Documentos Vitor\\Documents\\Programação\\Curso Udemy e Alura\\ExercicioFile\\IN.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				products.add(new Product(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2])));
				line = br.readLine();
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		for (Product e: products) {
			System.out.println("\n" + e);
		}
	}

}
