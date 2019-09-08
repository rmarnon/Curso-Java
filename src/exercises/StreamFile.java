package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class StreamFile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "D:\\ESOFT\\git\\Curso-Java\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salary = sc.nextDouble();
			
			System.out.printf("Email of peopple whose salary is more than %.2f:%n" , salary);
			
			Comparator<String> mail = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> email = list.stream()
					.filter(p -> p.getGrossSalary() >= salary)
					.map(p -> p.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			email.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(p -> p.getName().charAt(0) == 'M')
					.map(p -> p.getGrossSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.printf("Sum of salary of peopple whose name starts with 'M': %.2f", sum);
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}
