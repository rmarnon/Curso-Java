package test;

public class Teste {

	public static void main(String[] args) {
		
		Baratas b = new Baratas(10);
		
		b.breed();
		b.spray();		
		System.out.println("1 leva: " + String.format("%.2f", b.getRoaches()));
		
		b.breed();
		b.spray();		
		System.out.println("2 Leva " + String.format("%.2f", b.getRoaches()));
		
		b.breed();
		b.spray();		
		System.out.println("3 Leva " + String.format("%.2f", b.getRoaches()));
		
		b.breed();
		b.spray();		
		System.out.println("4 Leva " + String.format("%.2f", b.getRoaches()));
		
		b.breed();
		b.spray();		
		System.out.println("5 Leva " + String.format("%.2f", b.getRoaches()));
	}
}
