package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader_Otimizado {

	public static void main(String[] args) {
		
		String path = "D:\\ESOFT\\git\\Curso-Java\\in.txt";
				
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
						
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
	}
}
