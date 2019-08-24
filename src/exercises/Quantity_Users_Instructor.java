package exercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Quantity_Users_Instructor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> coursea = new HashSet<>();
		Set<Integer> courseb = new HashSet<>();
		Set<Integer> coursec = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			coursea.add(sc.nextInt());
		}
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			courseb.add(sc.nextInt());
		}
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			coursec.add(sc.nextInt());
		}
		
		Set<Integer> totalStudents = new HashSet<>(coursea);
		totalStudents.addAll(courseb);
		totalStudents.addAll(coursec);
		
		System.out.println("Total Students: " + totalStudents.size());
		
		sc.close();
	}
}
