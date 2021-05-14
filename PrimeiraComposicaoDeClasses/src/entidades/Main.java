package entidades;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.println("Name:");
		String name = sc.next();
		System.out.println("Email:");
		String email = sc.next();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		Date today = new Date();
		System.out.println("Status: " + OrderStatusEnum.PROCESSING);
		System.out.println("How many items to this order?");
		int n = sc.nextInt();
		Order order = new Order(today, OrderStatusEnum.PROCESSING, client);
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter #" + i + " item data: ");
			System.out.println("Product name: ");
			String productName = sc.next();
			System.out.println("Product price: ");
			Double productPrice = sc.nextDouble();
			Product product = new Product(productName, productPrice);
			System.out.println("Quantity: ");
			Integer quantity = sc.nextInt();
			OrderItem item = new OrderItem(quantity, productPrice, product);
			order.addItem(item);
		}
		
		for(int i = 1; i<= n; i++) {
			System.out.println(order);
		}
		sc.close();
	}
}
