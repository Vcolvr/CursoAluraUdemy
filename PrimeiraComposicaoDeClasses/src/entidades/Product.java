package entidades;

public class Product {

	private String nameProduct;
	private Double price;
	
	public Product() {	
	}
	
	public Product(String nameProduct, double price) {
		this.nameProduct = nameProduct;
		this.price = price;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setName(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getPrice() {
		return price;
	}

	public String toString() {
		return nameProduct;
	}

}
