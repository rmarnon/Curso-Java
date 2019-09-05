package entities;

public class Product implements Comparable<Product>{
	//Comparable usado p implementar o compareTo()

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
	
	@Override
	public int compareTo(Product other) {//Necessario implementar a interface Comparable<>
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}
	
	public static boolean staticProductPredicate(Product p) {//Predicate Reference metho c/ Static
		return p.getPrice() >= 100;
	}
	
	public boolean nonStaticProductpredicate() {//Predicate method s/ Static
		return getPrice() >= 100;
	}
	
	public static void staticPriceUpdate(Product p) {//Consumer method with static
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public static String staticUpperCaseName(Product p) {//Function method w/ static
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {// Function s/ static
		return name.toUpperCase();
	}
	
	public void nonStaticProductUpdate() {//Consumer method sem static
		price *= 1.2; //Opcional, pois esta trabalhando na propria classe (^ 20%)
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity
					+ " units, Total: $ " + String.format("%.2f", totalValueInStock());
	}

}
//this.quantity e' auto referencia para o objeto, que o chama, no caso seu o atributo "quantity"
//(int quantity) -> parametro do metodo/funcao, "argumento quantity"
