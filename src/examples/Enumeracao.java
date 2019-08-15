package examples;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Enumeracao {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);//Construtor c/ data atual
		
		OrderStatus os1 = OrderStatus.PROCESSING; //Sempre instanciar um objeto do tipo enum p/ impressao
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); //Converte Strng p/ enum 

		System.out.println(order);
		System.out.println(os1);
		System.out.println(os2); //String deve ser identica ao que foi definido no tipo enum
	}

}
