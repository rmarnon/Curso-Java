package examples;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEArraysTips {

	public static void main(String[] args) {
		
		//Ver tambem funcoes String!!!
		
		char[] array = {'O', 'l', 'a', ',', ' ', 'M', 'u', 'n', 'd', 'o'};
		char[] arrayVazio = new char[6];
		
		double[] d = {3.4, 1.2, 5.7, 6.9, 9.1};	
		Arrays.sort(d);//Ordena
		
		System.out.print("Ordenado: ");
		for(double x : d) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//Preenche elementos com elementos 7's
		int[] elementos = new int[10];
		Arrays.fill(elementos, 7);
		
		System.out.print("Preenchendo com 7's: ");
		for(int sete : elementos) {
			System.out.print(sete);
		}
		System.out.println();
		
		int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int[] copy = new int[array1.length];
		System.arraycopy(array1, 0, copy, 0, array1.length);
		//Copia do array1 partindo da posicao 0, para o copy, comecando no 0 e com tamanho array1
		
		System.out.print("Copia: ");
		for(int copia : copy) {
			System.out.print(copia + " ");
		}
		System.out.println();
		
		//Compara igualdade de arrays e retorn true or false
		boolean b = Arrays.equals(array1, copy);
		System.out.println("array1 equals copy? " + b);
		
		//Busca posicao em um array
		int local = Arrays.binarySearch(array1, 5);
		System.out.printf("Posicao do valor %d: %d" , 5,  local);
		System.out.println();
		
		//Tipos de construtores
		String s = "Ola, Mundo!";
		String s0 = new String();
		String s1 = s;
		String s2 = new String(array);
		String s3 = new String(array, 5, 3);
		
		String s5 = new String("Hello");
		String s6 = "good bye";
		String s7 = "GOOD BYE";
		String s10 = "Good ";
		String s11 = "Morning";
		
		String[] s8 = {"iniciado", "iniciando", "finalizado", "finalizando"};
		String s9 = "abcdefghijklmabcdefghijklm";
		
		String string1 = "Essa frase termina com 5 estrelas *****";
		String string2 = "1, 2, 3, 4, 5, 6, 7, 8, 9";
		
		//Copia caracteres de uma String 's' "do 5 ao 10" p/ um arrayVazio iniciando no 0.
		s.getChars(5, 11, arrayVazio, 0);
		
		System.out.println("S-" + s);
		System.out.println("S0-" + s0);
		System.out.println("S1-" + s1);
		System.out.println("S2-" + s2);
		System.out.println("S3-" + s3);
		
		System.out.print("S4-");
		for(char c : arrayVazio) {
			System.out.print(c);
		}
		
		//Imprime invertido
		System.out.println();
		System.out.print("Invertido: ");
		for(int count = s.length() - 1; count >= 0; count--) {
			System.out.print(s.charAt(count));
		}
		
		//Testa igualdade
		System.out.println();
		if(s5.equals("Hello")) //True, Sao o mesmo objeto "Referencia"
			System.out.println("S5.equals =  True");
		else
			System.out.println("S5.equals False");	
		
		//Compara objetos "Not Equals"
		if(s7.equals(s6))
			System.out.println("S6 Equals S7");
		else
			System.out.println("S6 Not equals S7");
		
		//False, pois sao objetos diferentes
		if(s5 == "Hello")
			System.out.println("S5 == Hello");
		else
			System.out.println("S5 != Hello");
		
		//Compara ignorando Maiusculas de Minusculas
		if(s6.equalsIgnoreCase(s7))
			System.out.println("S6 igual S7 com Case ignorado");
		
		//CimpareTo retorn um numero inteiro
		System.out.println("S6 compareTo S7: " + s6.compareTo(s7));
		System.out.println("S7 compareTo S6: " + s7.compareTo(s6));
		System.out.println("S6 compareTo S: " + s6.compareTo(s));
		System.out.println("S7 compareTo S7: " + s7.compareTo(s7));
		
		//Comparacao de igualdade entre partes de duas strings
		
		//Testa regionMatches (Distingue Maiusculas e Minusculas)
		if(s6.regionMatches(0, s7, 0, 5))//False fica implicito
			System.out.println("Primeiros 5 caracteres batem");
		else
			System.out.println("Primeiros 5 caracteres nao batem");
		
		//Testa regionMatches (Ignora Maiusculas e Minusculas)
		if(s6.regionMatches(true, 0, s7, 0, 5))
			System.out.println("Primeiros 5 caracteres batem com CASE ignorado");
		else
			System.out.println("Primeiros 5 caracteres nao batem com CASE ignorado");
		
		//starWith, endsWith(So funciona com Strings, nao funciona com char)
		for(String string : s8) {
			if(string.startsWith("in")) {
				System.out.println(string + " -> starsWith 'in'");
			}			
		}
		
		for(String string : s8) {
			if(string.startsWith("ali", 3)) {
				System.out.println(string + " -> starsWith 'ali na posicao 3'");
			}			
		} 
		
		for(String string : s8) {
			if(string.endsWith("ado")) {
				System.out.println(string + " => endsWith 'ado'");
			}
		}
		
		//indexOf e lastIndexOf
		System.out.println("'c' indexOf " + s9.indexOf('c'));
		System.out.println("'a' indexOf " + s9.indexOf('a', 1) + " a partir da posicao 1");
		System.out.println("'#' indexOf inexistente " + s9.indexOf('#'));//Nao existe
		System.out.println("'a' lastIndexOf " + s9.lastIndexOf('a'));
		System.out.println("\"def\" lastIndexOf " + s9.lastIndexOf("def"));
		
		System.out.println("S10.concat(S11) -> " + s10.concat(s11));
		
		//ReplaceAll
		System.out.print("Original String1: " + string1 + "\n");
		string1 = string1.replaceAll("\\*", "^");
		System.out.println("^ substituindo *: " + string1);
		string1 = string1.replaceAll("estrelas", "circunflexos");
		System.out.println("\"circunflexos\" substituindo \"estrelas\": " + string1);
		
		//Substitui todas as palavras por "palavra \\w+"
		System.out.println("Toda palavra substituida por \"Palavra\": " 
				+ string1.replaceAll("\\w+", "Palavra"));
		//Colocar '+' senao substitui toda letra por palavra nessa ER!!!
		
		System.out.print("Original String2: " + string2 + "\n");
		
		//Troca os 3 primeiros digitos por "Digito"
		for(int i = 0; i < 3; i++) {
			string2 = string2.replaceFirst("\\d", "Digito");
		}
		System.out.println("Tres primeiros digitos trocados por \"Digito\": " + string2);
		String[] result = string2.split(",\\s*");//Divide em virgulas ','
		System.out.println(Arrays.toString(result));//Exibe resultado da string entre []
		
		//ER que identifica aniversario "NAO" seja em Julho (1-6, 8-9) e nome comecado em 'R'.
		//Metodo matches aceita uma String que especifica ER e uma CharSequence correspondente
		//Retorna um boolean se o segundo argumento corresponde a ER
		boolean q = Pattern.matches("R.*\\d\\d-\\d[1-68-9]-\\d\\d", "Ray 29-07-82");
		boolean r = Pattern.matches("R.*\\d\\d-\\d[1-68-9]-\\d\\d", "Ray 29-04-82");
		System.out.println("Matches Ray 07: " + q);
		System.out.println("Matches Ray !07: " + r);
		
		//Se usada mais de 1 vez, usar metodo .compile p/ criar objeto Pattern especifico da ER
		//Recebe uma String como padrao que especifica a ER
		Pattern expressao = Pattern.compile("R.*\\d\\d-\\d[1-68-9]-\\d\\d");		
		
		//Ao usar o compile, certificar de haver + de 1 argumento na String como listado abaixo
		String nomes = "Rodrigo nasceu em 29-04-82\n" 
				+ "Gisely nasceu em 27-04-84\n" 
				+ "Renata nasceu em 04-07-70\n"
				+ "Roberval nasceu em 10-09-64\n";
		
		//O objeto Pattern gerado pode usar o metodo .matcher, que recebe uma CharSequence 
		//E retorna um objeto do tipo Matcher
		//Matcher tbm utiliza metodo .matches igual Pattern, porem sem argumentos
		//Outros metodos Matcher -> find, lookingAt, replaceFirst e replaceAll
		Matcher mat = expressao.matcher(nomes);
		
		while(mat.find()) {
			System.out.println(mat.group());
		}
	}

}
