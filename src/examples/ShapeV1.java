package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.enums.Color;
import model.entities.AbstractShape;

public class ShapeV1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<AbstractShape> list = new ArrayList<>();//Somente a interface "Shape" nao da acesso a cor
		
		System.out.print("Enter the numbers of shape: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangel or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED)");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}		
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (AbstractShape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
			System.out.println("Color: " + shape.getColor());
		}
		
		sc.close();
	}

}
