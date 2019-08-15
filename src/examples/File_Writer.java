package examples;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good evening"};
		
		String path = "D:\\ESOFT\\git\\Curso-Java\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			//Cria o arquivo se nao existe e zera e reescreve se ja existir
			//Pra nao zerar o arquivo e acrescentar, basta colocar "TRUE"-> new FileWriter(path, true)
			
			for (String line : lines) {//P cada String line contida no vetor lines
				bw.write(line);//Escreve essa linha no arquivo
				bw.newLine();//Quebra de linha tem que ser manual
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
