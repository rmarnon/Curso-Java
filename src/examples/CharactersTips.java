package examples;

public class CharactersTips {

	public static void main(String[] args) {
		
		Character[] array = {'a', 1, '#', '0', 'A'};
		
		//Verifica se esta definido nos carcteres unicode
		System.out.println("isDefined 'a': " + Character.isDefined(array[0]));
		System.out.println("isDefined 1: " + Character.isDefined(array[1]));
		System.out.println("isDefined '#': " + Character.isDefined(array[2]));
		System.out.println("isDefined '0': " + Character.isDefined(array[3]));
		System.out.println("isDefined 'A': " + Character.isDefined(array[4]));
		System.out.println();
		
		//Determina se o cactere eh um digito unicode
		System.out.println("isDigit 'a': " + Character.isDigit(array[0]));
		System.out.println("isDigit 1: " + Character.isDigit(array[1]));
		System.out.println("isDigit '#': " + Character.isDigit(array[2]));
		System.out.println("isDigit '0': " + Character.isDigit(array[3]));
		System.out.println("isDigit 'A': " + Character.isDigit(array[4]));
		System.out.println();
		
		//Determina se o cacter pode ser o primeiro identificador em Java ( _, letra ou  $)
		System.out.println("isJavaIdentifierStart 'a': " 
				+ Character.isJavaIdentifierStart(array[0]));
		System.out.println("isJavaIdentifierStart 1: " 
				+ Character.isJavaIdentifierStart(array[1]));
		System.out.println("isJavaIdentifierStart '#': " 
				+ Character.isJavaIdentifierStart(array[2]));
		System.out.println("isJavaIdentifierStart '0': " 
				+ Character.isJavaIdentifierStart(array[3]));
		System.out.println("isJavaIdentifierStart 'A': " 
				+ Character.isJavaIdentifierStart(array[4]));
		System.out.println();
		
		//Se o caractere pode ser usado em um identificador Java (digito, letra, _ ou $)
		System.out.println("isJavaIdentifierPart 'a': " 
				+ Character.isJavaIdentifierPart(array[0]));
		System.out.println("isJavaIdentifierPart 1: " 
				+ Character.isJavaIdentifierPart(array[1]));
		System.out.println("isJavaIdentifierPart '#': " 
				+ Character.isJavaIdentifierPart(array[2]));
		System.out.println("isJavaIdentifierPart '0': " 
				+ Character.isJavaIdentifierPart(array[3]));
		System.out.println("isJavaIdentifierPart 'A': " 
				+ Character.isJavaIdentifierPart(array[4]));
		System.out.println();
		
		System.out.println("isLetter 'a': " + Character.isLetter(array[0]));
		System.out.println("isLetter 1: " + Character.isLetter(array[1]));
		System.out.println("isLetter '#': "+ Character.isLetter(array[2]));
		System.out.println("isLetter '0': " + Character.isLetter(array[3]));
		System.out.println("isLetter 'A': " + Character.isLetter(array[4]));
		System.out.println();
		
		System.out.println("isLetterOrDigit 'a': " + Character.isLetterOrDigit(array[0]));
		System.out.println("isLetterOrDigit 1: " + Character.isLetterOrDigit(array[1]));
		System.out.println("isLetterOrDigit '#': "+ Character.isLetterOrDigit(array[2]));
		System.out.println("isLetterOrDigit '0': " + Character.isLetterOrDigit(array[3]));
		System.out.println("isLetterOrDigit 'A': " + Character.isLetterOrDigit(array[4]));
		System.out.println();
		
		System.out.println("isUpperCase 'a': " + Character.isUpperCase(array[0]));
		System.out.println("isUpperCase 1: " + Character.isUpperCase(array[1]));
		System.out.println("isUpperCase '#': "+ Character.isUpperCase(array[2]));
		System.out.println("isUpperCase '0': " + Character.isUpperCase(array[3]));
		System.out.println("isUpperCase 'A': " + Character.isUpperCase(array[4]));
		System.out.println();
		
		System.out.println("isLowerCase 'a': " + Character.isLowerCase(array[0]));
		System.out.println("isLowerCase 1: " + Character.isLowerCase(array[1]));
		System.out.println("isLowerCase '#': "+ Character.isLowerCase(array[2]));
		System.out.println("isLowerCase '0': " + Character.isLowerCase(array[3]));
		System.out.println("isLowerCase 'A': " + Character.isLowerCase(array[4]));
		System.out.println();
		
		System.out.println("toUpperCase 'a': " + Character.toUpperCase(array[0]));
		System.out.println("toUpperCase 1: " + Character.toUpperCase(array[1]));
		System.out.println("toUpperCase '#': "+ Character.toUpperCase(array[2]));
		System.out.println("toUpperCase '0': " + Character.toUpperCase(array[3]));
		System.out.println("toUpperCase 'A': " + Character.toUpperCase(array[4]));
		System.out.println();
		
		System.out.println("toLowerCase 'a': " + Character.toLowerCase(array[0]));
		System.out.println("toLowerCase 1: " + Character.toLowerCase(array[1]));
		System.out.println("toLowerCase '#': "+ Character.toLowerCase(array[2]));
		System.out.println("toLowerCase '0': " + Character.toLowerCase(array[3]));
		System.out.println("toLowerCase 'A': " + Character.toLowerCase(array[4]));
		System.out.println();
		
		//Conversao (Base 2, 8, 10 e 16), base radical (Digito ou Caracter, radix)
		System.out.printf("Converte digito para character: %s%n", Character.forDigit(15, 16));
		System.out.printf("Converte character para digito: %s%n", Character.digit('a', 16)); 
		
		//Objetos diferentes, instancias diferentes
		Character A1 = 'A';
		Character a1 = 'a';
		
		//charValue retorna o valor char no objeto
		//toString retorna uma representacao de String no objeto
		System.out.printf("A1 = %s%na1 = %s%n%n", A1.charValue(), a1.toString());
		
		//Se fossem ambos 'A', daria true e retornaria Equals
		if(!A1.equals(a1))// !
			System.out.println("Not equals!");
		else
			System.out.println("Equals!");		
	}
	
}
