package test;

import java.io.File;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class LeitorArquivo {

	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escolha a pasta: ");
		File path = new File(sc.nextLine());
		
			File[] files = path.listFiles(File::isFile);//isDirectory
			
			for (File file : files) {
				System.out.println(file.getName());
		}
	}
}
