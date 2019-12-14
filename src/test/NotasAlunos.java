package test;

public class NotasAlunos {

	private String curso;
	private int[] notas;
	
	public NotasAlunos(String curso, int[] notas) {
		this.curso = curso;
		this.notas = notas;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public int getMenorNota() {		
		int menor = notas[0];
		for(int nota : notas) {
			if(nota < menor) {
				menor = nota;
			}			
		}
		return menor;
	}
	
	public int getMaiorNota() {		
		int maior = notas[0];
		for(int nota : notas) {
			if(nota > maior) {
				maior = nota;
			}
		}
		return maior;
	}
	
	public double getMedia() {
		int soma = 0;
		for(int nota : notas) {
			soma += nota;
		}
		return (double)soma / notas.length;
	}
	
	public void saidaGraficaBarras() {
		System.out.println("Distribuicao das Notas: ");		
		int[] frequencia = new int[11];
		for(int nota : notas) {
			frequencia[nota / 10]++;
		}
		
		for(int contador = 0; contador < frequencia.length; contador++) {
			if(contador == 10) {
				System.out.printf("%5d: ", 100);
			}
			else {
				System.out.printf("%02d-%02d: ", contador * 10, contador * 10 + 9);
			}
			
			for(int barra = 0; barra < frequencia[contador]; barra++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void saidaComNotas() {
		for(int estudante = 1; estudante <= notas.length; estudante++) {
			System.out.printf("Estudante: %2d: %3d%n", estudante, notas[estudante - 1]);
		}
	}
	
	public void processarNotas() {
		saidaComNotas();
		System.out.println();
		System.out.printf("Media da classe: %.2f%n", getMedia());
		System.out.printf("A menor nota e: %d%nA Maior nota e: %d%n%n",getMenorNota(), getMaiorNota());
		saidaGraficaBarras();
	}
}
