package test;

public class Teste {

	public static void main(String[] args) {
		
		Bug b = new Bug(5);
		
		b.move();
		b.move();
		b.turn();
		b.move();
		b.move();
		b.move();
		b.turn();
		b.move();
		
		System.out.println(b.getPosition());
	}
}
