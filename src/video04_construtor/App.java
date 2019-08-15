package video04_construtor;

public class App {

	public static void main(String[] args) {

		Caneta c1 = new Caneta("Bic", "Azul", 0.7f);
		Caneta c2 = new Caneta("Tesla", "Vermelha", 0.5f);
		c1.status();
		c2.status();
	}
}

//c1.ponta = 0.5f; Gera erro por ser privado, ou seja, nao tem acesso direto a classe