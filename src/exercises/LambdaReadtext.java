package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Product;

public class LambdaReadtext {

	public static void main(String[] args)  {
		
		Locale.setDefault(Locale.US);
		Product p = new Product();
		List<Product> list = new ArrayList<>();
		
		String path = "D:\\ESOFT\\git\\Curso-Java\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String fileLine = br.readLine();
				while (fileLine != null) {
					String[] fields = fileLine.split(",");
					String name = fields[0];
					double price = Double.parseDouble(fields[1]);
					p = new Product(name, price);
					list.add(p);
					fileLine = br.readLine();
			}
			
			double sum = 0;
			for (Product prod : list) {
				sum += prod.getPrice();
			}
			
			double avg = sum / list.stream().count();
			
			System.out.println("Averege price: " + String.format("%.2f", avg));
			
			List<Product> produtos = list.stream().filter(p1 -> p1.getPrice() <= avg).collect(Collectors.toList());
			
			produtos.forEach(System.out::println);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
