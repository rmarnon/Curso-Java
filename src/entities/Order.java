package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	private static List<OrderItem> items = new ArrayList<>();
	
	public Order() {
	}
	
	public Order (Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public List<OrderItem> getItems() {
		return items;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() { 
		double sum = 0.0;
			for(OrderItem item : items) {
				sum += item.subTotal();
			}
			return sum;
	}

	public String toString() {
		/*return String.format("ID: %d%nData: %s%nStatus: %s%n", id, sdf.format(moment), status);*/
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n"); 
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("order itens: \n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total Price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
