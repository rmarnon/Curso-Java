package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.EmployeeList;

public class FileInteraceComparable {

	public static void main(String[] args) {
		
		List<EmployeeList> list = new ArrayList<>();//Antes era String
		String path = "D:\\ESOFT\\git\\Curso-Java\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new EmployeeList(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);//Ordenar uma colecao
			for (EmployeeList emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
