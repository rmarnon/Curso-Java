package entities;

public class Employee {

	private static int count = 0;
	private String name;
	private Integer hours;
	private String email;
	private Double valuePerHour;
	public double grossSalary;
	public double tax;

	public Employee() {
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
		count++;
	}
	
	public Employee(String name, String email, double grossSalary) {
		this.name = name;
		this.email = email;
		this.grossSalary = grossSalary;
		count++;
	}
	
	public static int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increasedSalary(double percentage) {
		this.grossSalary += grossSalary * percentage / 100;
	}
	
	public Double payment() {
		return valuePerHour * hours;
	}

	public String toString() {
		return "Email: " + email;
		
	}

}
