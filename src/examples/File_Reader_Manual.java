package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader_Manual {

	public static void main(String[] args) {
		
		String path = "D:\\ESOFT\\git\\Curso-Java\\in.txt";
		FileReader fr = null; //Inicia vazio
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);//Estabelece uma stream, uma sequencia de leitura p esse arquivo
			br = new BufferedReader(fr);//br instanciado a partir do FileReader (abstracao maior)
			
			String line = br.readLine();//Le uma linha do arquivo e se chegar no final, retorna NULL
			
			while (line != null) {//Leu com sucesso a linha
				System.out.println(line);
				line = br.readLine();//Le novamente outra linha
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {//Pode ocorrer excecao na hora de fecahar os Streams
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}				
			}
			catch (IOException e) {
				e.printStackTrace();//Mostra direitinho o erro se nao fechar os Streams
			}
		}
	}
}
