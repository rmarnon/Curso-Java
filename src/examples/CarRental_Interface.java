package examples;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class CarRental_Interface {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc  =new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		System.out.println("enter rental data: ");
		System.out.print("Car model: ");
		String model = sc.nextLine();
		System.out.print("PickUp: ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return: ");
		Date finish = sdf.parse(sc.nextLine());
		
		CarRental cr = new CarRental(start, finish, new Vehicle(model));
		
		System.out.print("Enter price per hour: ");
		double pricePerHour  =sc.nextDouble();
		System.out.print("Enter price per day: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rs = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		
		rs.processInvoice(cr);
		
		System.out.println("Invoice: ");
		System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: "  + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));		
		
		sc.close();
	}

}
