package test;

public class NotasAlunosMatriz {

	private String curso;
	private int[][] notas;
	
	public NotasAlunosMatriz(String curso, int[][] notas) {
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
		int menor = notas[0][0];
		for(int[] notaEstudante : notas) {
			for(int nota : notaEstudante) {
				if(nota < menor) {
					menor = nota;
				}
			}			
		}
		return menor;
	}
	
	public int getMaiorNota() {		
		int maior = notas[0][0];
		for(int[] notaEstudante : notas) {
			for(int nota : notaEstudante) {
				if(nota > maior) {
					maior = nota;
				}
			}	
		}
		return maior;
	}
	
	public double getMedia(int[] mediaParticular) {
		int soma = 0;
		for(int nota : mediaParticular) {
			soma += nota;
		}
		return (double)soma / mediaParticular.length;
	}
	
	public void saidaGraficaBarras() {
		System.out.println("Distribuicao das Notas em graficos: ");		
		int[] frequencia = new int[11];
		for(int[] notaEstudante : notas) {
			for(int nota : notaEstudante) {
				frequencia[nota / 10]++;
			}	
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
		System.out.println("As notas sao: \n");
		 System.out.print("            "); 
		 for (int teste = 0; teste < notas[0].length; teste++) {
			 System.out.printf("   Teste %d", teste + 1);
		 }
		 System.out.println("    Media");
		 for(int estudante = 0; estudante < notas.length; estudante++) {
			 System.out.printf("Estudante %2d", estudante + 1);
			 for(int teste : notas[estudante]) {
				 System.out.printf("%10d", teste);
			 }
			 double media = getMedia(notas[estudante]); 
			 System.out.printf("%9.2f%n", media);
		 }
	}
	
	public void processarNotas() {
		saidaComNotas();
		System.out.printf("%n%s %d%n%s %d%n%n", 
				"Menor nota e:", getMenorNota(), 
				"Maior nota e:", getMaiorNota());	
		saidaGraficaBarras();
	}
}
