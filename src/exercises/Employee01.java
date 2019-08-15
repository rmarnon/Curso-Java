package exercises;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Employee01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.setName(sc.nextLine()) ;
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(employee);
		
		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increasedSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}

}
