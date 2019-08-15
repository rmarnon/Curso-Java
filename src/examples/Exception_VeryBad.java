package examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation1;

/*
 *  Logica de validacao no programa principal
 *  logica de validacao nao delegada a reserva
 */

public class Exception_VeryBad {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number");
		int roomNumber = sc.nextInt();
		System.out.print("Check-in (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {// Se data de saida nao e posterior a data de entrada
			System.out.println("Error in reservation: Check-out date must be after Check-in date!");
		} 
		else {
			Reservation1 reservation = new Reservation1(roomNumber, checkIn, checkOut);
			System.out.println("reservation: " + reservation);

			System.out.println();
			System.out.println("Enter data to update reservation: ");
			System.out.print("Check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			Date now = new Date();

			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("Error in reservation: Reservation dates for updates must be future dates");
			} 
			else if (!checkOut.after(checkIn)) {// Se data de saida nao e posterior a data de entrada
				System.out.println("Error in reservation: Check-out date must be after Check-in date!");
			} 
			else {
				reservation.updateDate(checkIn, checkOut);
				System.out.println("reservation: " + reservation);
			}
		}

		sc.close();

	}

}
