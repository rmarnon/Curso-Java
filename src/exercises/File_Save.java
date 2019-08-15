package exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class File_Save {

	public static void main(String[] args) throws ParseException{
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();

		System.out.println("Enter a file path: ");
		File file = new File(sc.nextLine());
		
		String strFolder = file.getParent();//Pega o diretorio sem o nome do arquivo
		boolean success = new File(strFolder + "\\out").mkdir();//Cria pasta out dentro da pasta de file
		String strNewFile = strFolder + "\\out\\summary.csv";//Cria novo diretorio c/ novo arquivo

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			String item = br.readLine();//Le a linha do arquivo ate o fim, depois retorna NULL
			
			while (item != null) {
				String[] string = item.split(",");
				String name = string[0];
				double price = Double.parseDouble(string[1]);
				int quantity = Integer.parseInt(string[2]);

				list.add(new Product(name, price, quantity));
				item = br.readLine();//Le nova linha
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(strNewFile))) {
				
				for (Product p : list) {//Pega nome + totalProduto e atribui ao novo arquivo
					bw.write(p.getName() + "," + String.format("%.2f", p.totalValueInStock()));
					bw.newLine();
				}
				System.out.println(strNewFile + " CREATED!");	
			} 
			catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		} 
		catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}
}
