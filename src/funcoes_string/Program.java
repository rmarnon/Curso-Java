package funcoes_string;

public class Program {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase(); //Passa todos os caracteres para minuscula
		String s02 = original.toUpperCase(); //Passa todos os caracteres para maiuscula
		String s03 = original.trim(); //Retira espacos vazios nas "Pontas"
		String s04 = original.substring(2); //Pega da posicao (2), em diantes
		String s05 = original.substring(2, 9);//Pega (2) e vai ate posicao (8), ignorando o 9 p/ frente
		String s06 = original.replace('a', 'x');//Trocara 'a' minusculo por um 'x' minusculo
		String s07 = original.replace("abc", "xyz");//Troca string(s) "abc" por outra "xyz"
		int i = original.indexOf("abc"); //Traz a primeira posicao de uma string selecionada (1)
		int j = original.lastIndexOf("abc");//Traz a ultima ocorrencia de uma string selecionada (17)
		
		//Split e Length //
		
		String s = "Apple Orange Potato Strawsbarry Lemon";
		int z = s.length();//Quantidade de caracteres da String "s"
		String[] vect = s.split(" ");//Recorta a string usando separador " " e atribui ao vetor vect	
		
		System.out.println("Original:          -" + original + "-");
		System.out.println("toLowerCase:       -" + s01 + "-"); 
		System.out.println("toUpperCase:       -" + s02 + "-");
		System.out.println("trim:              -" + s03 + "-");
		System.out.println("Substring(2)       -" + s04 + "-" );
		System.out.println("Substring(2, 9)    -" + s05 + "-" );
		System.out.println("replace('a','x')   -" + s06 + "-");
		System.out.println("replace(abc, xyz)  -" + s07 + "-");
		System.out.println("indexOf('bc')      " + i);
		System.out.println("lastIndexOf('bc')  " + j);
		System.out.println("----------------------------------------");
		System.out.println("Total de caracteres = " + z);
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		System.out.println(vect[4]);
		
		System.out.println("\nOU\n");
		
		System.out.printf("Total de tokens/palavras: %d%nOs Tokens sao:%n", vect.length);
		for(String tokens : vect) {			
			System.out.println(tokens);
		}		
	}
}
