package util;

public class Calculator {

	public static final double PI = 3.14159;
	
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
}
// Classe sem o "Static" deve ser  instanciada em outro metodo ao ser chamado

// Classe com "Static" nao precisa ser instanciada, basta colocar o nome da Classe.metodo();