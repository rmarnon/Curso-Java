package examples;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_Test {

	public static void main(String[] args) {

		File file = new File("D:\\ESOFT\\git\\Curso-Java\\in.txt");
		//Sempre coloca duas barras, uma representa prefixo de caracteres especiais
		
		Scanner sc = null;//Inicia com null so p ter um valor inicial
		
		try {//Ao instanciar, o programaa pode tentar abrir o arquivo e pode gerar IOException (tratar).
			sc = new Scanner(file);//Le o arquivo no lugar de System.in
			while (sc.hasNextLine()) {// Testa se existe uma nova linha no arquivo.
				System.out.println(sc.nextLine());//Le a linha do arquivo e imprime
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {//Boa pratica fechar o recurso no finally, porque sera fechado independente de dar erro ou nao.
			if (sc != null) {//Pode dar erro NullPointerException ao instancir sc e ele nao ser aberto, por isso testar
				sc.close();
			}
		}
	}

}
