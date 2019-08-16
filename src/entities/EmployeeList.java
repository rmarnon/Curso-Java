package entities;

public class EmployeeList implements Comparable<EmployeeList>{

	private Integer id;
	private String name;
	private Double salary;

	public EmployeeList() {

	}

	public EmployeeList(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public EmployeeList(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void increaseSalary(Double percentage) {
		salary += salary * percentage / 100;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

	@Override
	public int compareTo(EmployeeList other) {
		return -salary.compareTo(other.getSalary());
	}
	
}