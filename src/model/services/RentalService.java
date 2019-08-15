package model.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {//Servico de aluguel

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService tax) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = tax;
		//Construtor padrao somente classes de entidades pois alguns frameworks a utilizam
	}
	
	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();//getTime pega valor em milisegundos da data.
		long t2 = carRental.getFinish().getTime();
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;//Segundos / Minutos / Horas
		
		double basicPayment;
		if (hours <= 12) {
			basicPayment = Math.ceil(hours) * pricePerHour;//Math.ceil arredonda horas p/ cima
		}
		else {
			basicPayment = Math.ceil(hours / 24) * pricePerDay;//Acha a quantidade em dias
		}
		
		double tax = taxService.tax(basicPayment);//calcula valor do imposto a partir de basicPayment
		
		carRental.setInvoice(new Invoice(basicPayment, tax));//Cria novo objeto Nota, associa c/ Aluguel
	}
}
