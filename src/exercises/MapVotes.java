package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import entities.Political;

public class MapVotes {

	public static void main(String[] args) {		

		String path = "D:\\ESOFT\\git\\Curso-Java\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<Political, Integer> votes = new TreeMap<>();
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer quantity = Integer.parseInt(fields[1]);
		
				Political political = new Political(name, quantity);
				
				if (votes == null) {
					votes.put(political, quantity);
				}
				
				if (votes.containsKey(political) == true) {
					political.totVotes(quantity);
					votes.put(political, political.getQuantity());
				}
				else {
					votes.put(political, quantity);
				}
				
				line = br.readLine();				
			}
			
			for (Political p : votes.keySet()) {
				System.out.println(p);
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
