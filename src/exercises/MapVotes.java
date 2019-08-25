package exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class MapVotes {

	public static void main(String[] args) {		

		String path = "D:\\ESOFT\\git\\Curso-Java\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<String, Integer> votes = new TreeMap<>();
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer quantity = Integer.parseInt(fields[1]);
				
				if (votes.containsKey(name) == true) {
					int tot = votes.get(name) + quantity;
					votes.put(name, tot);
				}
				else {
					votes.put(name, quantity);
				}
				
				line = br.readLine();				
			}
			
			for (String p : votes.keySet()) {
				System.out.println( p + ", " + votes.get(p));
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
