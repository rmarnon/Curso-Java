package entities;

public class Employee {

	private String name;
	private Integer hours;
	private Double valuePerHour;
	public double grossSalary;
	public double tax;

	public Employee() {
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Employee: " + name + ", $ " + String.format("%.2f", netSalary());
		
	}

}
