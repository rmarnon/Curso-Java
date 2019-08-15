package examples;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle; //Importada apos ctrl+shift+o em: Triangle x, y do pacote entities

public class Triangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y; //x e y sao do tipo Triangle, poderia ser double, String, int...
		
		x = new Triangle(); //Instancias de objeto do tipo Triangle
		y = new Triangle();
		
		System.out.print("Enter the measures of triangle x: ");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.print("Enter the measures of triangle y: ");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double areaX = x.area(); //Objeto x/y chama o metodo "area" que contem os calculos		
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Large area X");
		}
		else {
			System.out.println("Large area Y");
		}
		
		sc.close();
	}

}
