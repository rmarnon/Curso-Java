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
			
			Map<String, Integer> map = new TreeMap<>();
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				String nameKey = fields[0];
				Integer quantity = Integer.parseInt(fields[1]);
				
				if (map.containsKey(nameKey)) {
					int tot = map.get(nameKey) + quantity;
					map.put(nameKey, tot);
				}
				else {
					map.put(nameKey, quantity);
				}
				
				line = br.readLine();				
			}
			
			for (String key : map.keySet()) {
				System.out.println(key + ", " + map.get(key));
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
