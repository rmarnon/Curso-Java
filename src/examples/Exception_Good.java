package examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation3;
import model.exceptions.DomainException;

/*
 * // Solucao ideal, tratamento de excecoes
 */

public class Exception_Good {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
	
			Reservation3 reservation = new Reservation3(roomNumber, checkIn, checkOut);
			System.out.println("reservation: " + reservation);
	
			System.out.println();
			System.out.println("Enter data to update reservation: ");
			System.out.print("Check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
	
			reservation.updateDate(checkIn, checkOut);
			System.out.println("reservation: " + reservation);
		}
		catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();

	}

}
