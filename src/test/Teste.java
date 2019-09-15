package test;

public class Teste {

	public static void main(String[] args) {
		
	Car car = new Car(50);
	
	car.addGas(20);
	
	car.dirigir(100);
	car.dirigir(100);
	
	System.out.println(car.verificaCombustivel());
		
	}
}
