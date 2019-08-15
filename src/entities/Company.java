package entities;

public class Company extends TaxPayer{

	private Integer numberOfemployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfemployees) {
		super(name, anualIncome);
		this.numberOfemployees = numberOfemployees;
	}

	public Integer getNumberOfemployess() {
		return numberOfemployees;
	}

	public void setNumberOfemployess(Integer numberOfemployees) {
		this.numberOfemployees = numberOfemployees;
	}
	
	@Override
	public Double tax() {
		if (numberOfemployees > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}	
}
