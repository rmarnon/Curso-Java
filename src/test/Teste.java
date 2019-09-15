package test;

public class Teste {

	public static void main(String[] args) {
		
		Conta a = new Conta();
		Conta b = new Conta();
		
		a.setSaldo(1000.00);
		b.setSaldo(1000.00);
		
		a.transferencia(b, 250);
		
		System.out.println("Saldo conta A: " + a.getSaldo());
		System.out.println("Expected: 745");
		System.out.println("Saldo conta B: " + b.getSaldo());
		System.out.println("Expected: 1250");
		
	}
}
