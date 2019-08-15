package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufacturedDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public final String tagPrice() {
		return getName() 
				+ " (Used) $ " 
				+ String.format("%.2f", getPrice()) 
				+ " (Manufacture date: " 
				+ sdf.format(manufacturedDate) 
				+ ")";
	}
	
}
