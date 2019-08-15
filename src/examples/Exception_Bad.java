package examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation2;

/*
 * Metodo retornando uma String
 * A semantica da operacao e prejudicada
 *  	* Retornar uma String nao tem nada haver com atualizacao da reserva
 *  	* E se a opercao tivesse que retornar uma String? (Daria conflito).
 * Ainda nao e possivel tratar excecoes em construtores
 * Ainda nao ha o auxilio do compilador: O programa deve lembrar de verificar se houve erro
 * A logica fica estruturada em condicoes aninhadas (if/else).
 */

public class Exception_Bad {

		public static void main(String[] args) throws ParseException {

			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			System.out.print("Room number");
			int roomNumber = sc.nextInt();
			System.out.print("Check-in (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());

			if (!checkOut.after(checkIn)) {//Essa validacao nao da p/ tirar pq o construtor nao retorna!
				System.out.println("Error in reservation: Check-out date must be after Check-in date!");
			} 
			else {
				Reservation2 reservation = new Reservation2(roomNumber, checkIn, checkOut);
				System.out.println("reservation: " + reservation);

				System.out.println();
				System.out.println("Enter data to update reservation: ");
				System.out.print("Check-in (dd/MM/yyyy): ");
				checkIn = sdf.parse(sc.next());
				System.out.print("Check-out (dd/MM/yyyy): ");
				checkOut = sdf.parse(sc.next());

				String error = reservation.updateDate(checkIn, checkOut);
				if (error != null) { //A funcao updateDates passou a retornar uma String
					System.out.println("Error in reservation: " + error);
				}
				else {
					System.out.println("reservation: " + reservation);
				}
			}

			sc.close();

		}

	}
