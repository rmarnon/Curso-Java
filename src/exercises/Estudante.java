package exercises;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Estudante {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Student student = new Student();
			
				System.out.print("Name: ");
				student.name = sc.nextLine();
				
				do {
					System.out.print("Nota 1: ");
					student.grade1 = sc.nextDouble();
				} while (student.grade1 > 30);
				
				do {
					System.out.print("Nota 2: ");
					student.grade2 = sc.nextDouble();					
				} while (student.grade2 > 35);
				
				do {
					System.out.print("Nota 3: ");
					student.grade3 = sc.nextDouble();					
				} while (student.grade3 > 35);
			
				System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());      
				
				if (student.finalGrade() < 60.0) {    
					System.out.println("FAILED");   
					System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());   
				}   
				else {    
					System.out.println("PASS");   
				} 
			
			sc.close();
	}

}
