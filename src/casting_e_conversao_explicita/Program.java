package casting_e_conversao_explicita;

public class Program {

	public static void main(String[] args) {
		
		double a;
		int c;
		
		a = 5.7;
		//c = a da erro pois nao sao do mesmo tipo
		c = (int)a; //Fazendo o casting quebra o valor retornando a parte inteira 5
		
		int x, y;
		x = 5;
		y = 2;
		double result1;
		double result2;
		
		result1 = x/y;//Conversao explicita e' permitida de uma variavel inferior pra uma superior, 
					  //mas nao quebra o valor 5/2 = 2 e resta 1
		result2 = (double) x / y;//Casting ira fazer a divisao da forma adequada, convertendo inteiro 
			                    //pra Double
		
		int z;
		double w;
		String s = "33";
		z = Integer.parseInt(s);
		w = Double.parseDouble(s);
		
		
		System.out.println("Usando Casting Double -> Int: " + c);
		System.out.println("Usando Conversao Explicita Int -> Double: " + result1);
		System.out.println("Usando Casting Double A / Int B: " + result2);
		System.out.println("Usando funcao de conversao String -> Int: " + z);
		System.out.println("Usando funcao de conversao String -> Double: " + w);

	}

}
