package entidades;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private OrderStatusEnum status;
	private Client client;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}
	
	public Order(Date moment, OrderStatusEnum status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatusEnum getStatus() {
		return status;
	}

	public void setStatus(OrderStatusEnum status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public Double total() {
	Double total = 0.0;
		for(OrderItem i : items) {
			total = total + i.subTotal();
		}
		return total;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Summary:\n");
		sb.append("Order moment: " + sdf.format(moment) + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client + "\n");
		sb.append("Order items:");
		for(OrderItem i : items) {
			sb.append( i.getProduct().getNameProduct()  + ", $" + String.format("%.2f", i.getPrice()) + 
					", Quantity: " + i.getQuantity() + ", Subtotal: $" + String.format("%.2f", i.subTotal() )+ "\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total() ));
		return sb.toString();
	}
	
}
