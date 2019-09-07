package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Product;

public class LambdaReadtext {

	public static void main(String[] args)  {
		
		Locale.setDefault(Locale.US);		
		
		String path = "D:\\ESOFT\\git\\Curso-Java\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Product> list = new ArrayList<>();	
			
			String fileLine = br.readLine();
				while (fileLine != null) {
					String[] fields = fileLine.split(",");
					list.add(new Product(fields[0], Double.parseDouble(fields[1])));
					fileLine = br.readLine();
			}
			
			double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (x, y) -> x + y) / list.size();
			
			System.out.println("Averege price: " + String.format("%.2f", avg));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName())
					.sorted(comp.reversed())
					.collect(Collectors.toList());
						
			names.forEach(System.out::println);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
