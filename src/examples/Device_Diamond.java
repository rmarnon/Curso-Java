package examples;

import device.ComboDevice;
import device.ConcretePrinter;
import device.ConcreteScanner;

public class Device_Diamond {

	public static void main(String[] args) {
		
		ConcretePrinter printer = new ConcretePrinter("1080");
		printer.processDoc("My letter");
		printer.print("My letter says....");
		
		System.out.println();
		ConcreteScanner scanner = new ConcreteScanner("2160");
		scanner.processDoc("My email");
		System.out.println("Scan result: " + scanner.scan());
		
		System.out.println();
		ComboDevice comboDevice = new ComboDevice("4320");
		comboDevice.processDoc("My dissertatiion");
		comboDevice.print("My dissertation next");
		System.out.println("Scan result : " + comboDevice.scan());
		
	}

}
