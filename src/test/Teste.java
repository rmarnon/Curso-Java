package test;

public class Teste {

	public static void main(String[] args) {
		
	DepositTime d = new DepositTime(5, 200);
	
	d.getSaldo();
	System.out.println("Inicio -> Expected 200.00 " );
	System.out.println(d.getSaldo());
	
	d.addJuros();
	System.out.println("Com juros -> Expected 210.00");
	System.out.println(d.getSaldo());
	
	d.addJuros();
	System.out.println("Com juros -> Expected 220.50");
	System.out.println(d.getSaldo());
	
	d.saque(220.50);
	System.out.println("Expected 0");
	System.out.println(d.getSaldo());
	

		
	}
}
