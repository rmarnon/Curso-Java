package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	//Atributos basicos
	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	// Atributos das associacoes, "composicao de objetos"
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();
	// * Varios contratos, usar List.
	// Lista deve ser Instanciada por padrao na classe.

	public Worker() {
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	} // Nunca colocar atributos que sejam "List" em um construtor!!!

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}// Adiciona um contrato a Lista de contratos

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}// Remove um contrato da Lista de contratos

	public Double income(int month, int year) { // Income = ganho.
		double sum = baseSalary;
		Calendar calendario = Calendar.getInstance();
		
		for (HourContract c : contracts) {// Para cada contrato c na lista de contratos
			calendario.setTime(c.getDate());//Pega mes/ano do contrato c e define como mes/ano Calendario
			int c_year = calendario.get(Calendar.YEAR);
			int c_month = 1 + calendario.get(Calendar.MONTH);//Soma 1 no mes

			if (c_year == year && c_month == month) {
				sum += c.totalValue(); // Se contrato c estiver naquele mes/ano, ele soma com totalValue
			}
		}
		return sum;
	}
}