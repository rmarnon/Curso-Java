package examples;

public class DateComThis {

	private int dia;
	private int mes;
	private int ano;

	private static final int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public DateComThis(int dia, int mes, int ano) {

		// Verifica se mes esta no intervalo
		if (mes <= 0 || mes > 12) {
			throw new IllegalArgumentException(
					"Mes (" + mes + ") deve estar na faixa de 1 - 12");
		}

		// Verifica se o dia esta no intervalo para o repectivo mes
		if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29))) {
			throw new IllegalArgumentException(
					"Dia (" + dia + ") " + "deve estar na faixa especificada  "
							+ "de 1 - " + diasPorMes[mes] + " para o mes (" + mes + ")");
		}

		// Verifica no ano bisexto se o mes eh 02 e dia eh 29
		if (mes == 2 && dia == 29 && !(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0))) {
			throw new IllegalArgumentException(
					"Dia (" + dia + ") " + "deve ocorrer apenas em anos bissextos");
		}
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

		System.out.printf("Objeto Date construido para a data: %s usando This%n", this);
	}

	public String toString() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}

}
