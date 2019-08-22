package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import model.services.CalculationService;

public class ProductMostExpensive {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "D:\\ESOFT\\git\\Curso-Java\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}	
			
			Product x = CalculationService.max(list);//Funcao estatica que calcula o maior valor
			System.out.println("Most expensive: ");
			System.out.println(x);
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
