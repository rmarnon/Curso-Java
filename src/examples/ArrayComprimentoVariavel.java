package examples;

 public class ArrayComprimentoVariavel {
	
	public static double media(double... numbers) {//Reticencias deve ser colocado por ultimo como argumento
		double total = 0;							//Serve para aceitar qualquer quantidade de parametros
		for(double d : numbers) {
			total += d;
		}
		return total / numbers.length;
	}

	public static void main(String[] args) {
		
		double d1 = 10;
		double d2 = 20;
		double d3 = 30;
		double d4 = 40;
		double d5 = 100;
		
		System.out.printf("Media entre %s e %s = %.2f%n", d1, d2, media(d1, d2));
		System.out.printf("Media entre %s, %s e %s = %.2f%n", d1, d2, d3, media(d1, d2, d3));
		System.out.printf("Media entre %s, %s, %s e %s = %.2f%n", d1, d2, d3, d4, media(d1, d2, d3, d4));
		System.out.printf("Media entre %s, %s, %s, %s e %s = %.2f%n", d1, d2, d3, d4,d5, media(d1, d2, d3, d4, d5));

	}
	
 }	
