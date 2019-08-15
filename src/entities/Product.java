package entities;

public class Product {

	private String name;
	private Double price;
	private int quantity;
	
	public Product() {
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
		public Product(String name, double price) {
		this.name = name;
		this.price = price;
		quantity = 0; //Ja referencia o atributo pois nao tem esse parametro "quantity".
		// Opcional, pois por padrao int, double comecam com valor "0".
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}							  
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String tagPrice() {
		return name + " $ " + String.format("%.2f", price);
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity
					+ " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}
	
}
//this.quantity e' auto referencia para o objeto, que o chama, no caso seu o atributo "quantity"
//(int quantity) -> parametro do metodo/funcao, "argumento quantity"
