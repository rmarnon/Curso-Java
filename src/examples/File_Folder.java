package examples;

import java.io.File;
import java.util.Scanner;

public class File_Folder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);//Pode ser caminho de arquivo ou pasta
		
		File[] folders = path.listFiles(File::isDirectory);//Funcao retorna diretorios das pastas
		
		System.out.println();
		System.out.println("Folders");
		for (File folder : folders) {//P cada folder na lista de folders
			System.out.println(folder);//lista diretorio das pastas dentro do diretorio informado
		}
		
		File[] files = path.listFiles(File::isFile); //Funcao retorna todos arquivos, exceto pastas
		
		System.out.println();
		System.out.println("Files");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\FolderTest").mkdir();//mkdir() Cria um diretorio
		//Cria a subpasta "FolderTest" a partit da pasta "strPath"
		//Se a pasta ja existir ele retornara um false e nao criara a pasta 
		
		System.out.println();
		System.out.println("Directory created successfully: " + success);
		
		System.out.println();
		System.out.println("getName " + path.getName());//Retorna somente o nome (Pasta/Arquivo)
		System.out.println("getParent " + path.getParent());//Retorna somente o caminho (Pasta/Arquivo)
		System.out.println("getPath " + path.getPath());//Retorna nome/caminho completo (Pasta/Arquivo)
		
		sc.close();
	}

}
