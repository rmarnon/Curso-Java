package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Polimorfismo {

	@SuppressWarnings({ "resource", "static-access" })
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		Employee z = new Employee("Rodrigo", 12, 1200.00);
		System.out.println("Contagem objeto - " + z.getCount());//Objeto chamando metodo estatico
		
		System.out.println("Iniciando contagem..." + Employee.getCount());//classe chamando metodo estatico
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();	
			
			if (ch == 'y') {
				System.out.print("Aditional charge: ");
				Double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
				System.out.println("Adicionando..." + Employee.getCount());
			}
			else {
				list.add(new Employee(name, hours, valuePerHour));
				System.out.println("Adicionando..." +Employee.getCount());
			}
		}
		
		if(Employee.getCount() != 0) {
			System.out.println();
			System.out.println("Payments: ");
			for (Employee e : list) {
				System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));				
			}
			System.out.println("Contagem Final Employee.getCount = " + Employee.getCount());
			System.out.println("Contagem Final z.getCount = " + z.getCount());
			System.out.println("Ambos objeto e metodo compartilham o mesmo count static da classe Employee");
		}
		else {
			throw new RuntimeException("Nao ha funcionarios cadastrados!");
		}
		
		sc.close();
	}

}
