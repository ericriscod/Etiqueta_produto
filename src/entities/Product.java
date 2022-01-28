package entities;

public class Product {

	protected String name;
	protected Double price;

	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String priceTag() {	
		return name + " $" + String.format("%.2f", price);
	}
	
}
