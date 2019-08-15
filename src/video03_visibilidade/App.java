package video03_visibilidade;

public class App {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();		
		c1.modelo = "Bic Cristal";
		c1.cor = "Azul";
		//c1.ponta = 0.5f;
		c1.carga = 80;  
		//c1.tampada = false;
		c1.destampar();
		c1.status();
		c1.rabiscar(); 
	}
}

/*
* Se atributo for protected, (carga) aceita porque usa objeto c1 da classe Caneta dentro do main.
* Se atributo/metodo for privado gera erro de visibilidade (ponta, tampada()).
* Metodo destampar/tampar sao publicos, usa o atributo tampada privado, mas esta dentro da propria classe
*/