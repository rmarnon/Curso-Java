package entities;

public final class ImportedProduct extends Product{

	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return customsFee + getPrice();
	}
	
	@Override
	public final String tagPrice() {
		return getName() 
				+ " $ " 
				+ String.format("%.2f", totalPrice())
				+ String.format(" (Customs fee: $ %.2f) ", customsFee);
	}	
	
}
