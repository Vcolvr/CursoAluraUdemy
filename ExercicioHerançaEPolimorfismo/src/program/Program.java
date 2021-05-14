package program;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

import entities.Product;
import entities.UsedProduct;
import entities.ImportedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> products = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.println("Common, used or imported (c/u/i)?");
			char response = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Price: ");
			double price = sc.nextDouble();
			if(response == 'c') {
				Product product = new Product(name, price);
				products.add(product);
			}
			else if(response == 'u') {
				System.out.println("When this item was made? (dd/MM/yyyy)");
				Date manufactureDate = sdf.parse(sc.next());
				UsedProduct uProduct = new UsedProduct(name, price, manufactureDate);
				products.add(uProduct);
			}
			else {
				System.out.println("What's this item customs fee?");
				double customsFee = sc.nextDouble();
				ImportedProduct iProduct = new ImportedProduct(name, price, customsFee);
				products.add(iProduct);
			}
		}
		System.out.println();
		System.out.println("Price Tags: ");
		
		for(Product p : products) {
			System.out.println(p.priceTag());	
		}
		sc.close();
	}	
}

