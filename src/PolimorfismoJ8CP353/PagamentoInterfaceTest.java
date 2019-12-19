package PolimorfismoJ8CP353;

public class PagamentoInterfaceTest {

	public static void main(String[] args) {
		
		Pagamento[] lista = new Pagamento[4];
		
		lista[0] = new Fatura("1234", "Teclado", 4, 79.95);
		lista[1] = new Fatura("5678", "Monitor", 2, 375.00);
		lista[2] = new FuncionarioAssalariado("Rodrigo", "Barros", "1234567890", 800.00);
		lista[3] = new FuncionarioAssalariadoComissionado(
				"Gisely", "Morato", "7894561230", 5000.00, 0.04, 300.00);
		
		System.out.println("Processando Pagamento de Fatura e Funcionarios:");
		
		for(Pagamento pag : lista) {
			System.out.printf("%n%s%n%s R$%,.2f%n", pag, "Pagamento atualizado: ", pag.getCalculaPagamento());
		}
	}

}
