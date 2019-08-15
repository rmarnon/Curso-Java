package examples;

import device.Printer;
import device.Scanner;

public class Device_Diamond {

	public static void main(String[] args) {
		
		Printer printer = new Printer("1080");
		printer.processDoc("My letter");
		printer.print("My letter says....");
		
		System.out.println();
		Scanner scanner = new Scanner("2040");
		scanner.processDoc("My email");
		System.out.println("Scan result: "  +scanner.scan());
		
	}

}
