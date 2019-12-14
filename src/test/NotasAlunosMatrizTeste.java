package test;

public class NotasAlunosMatrizTeste {

	public static void main(String[] args) {
		
		 int[][] notas = {{87, 96, 70}, 
		 				  {58, 87, 90}, 
		 				  {94, 100, 90}, 
						  {100, 81, 82},
						  {83, 65, 85}, 
						  {78, 87, 65}, 
						  {85, 75, 83},
						  {91, 94, 100},
						  {76, 72, 84}, 
						  {87, 93, 73}}; 
		 NotasAlunosMatriz minhasNotas = new NotasAlunosMatriz("Curso Java completo 8 Edicao", notas);
		 System.out.printf("Livro de notas para o curso: %n%s%n%n", minhasNotas.getCurso());
			minhasNotas.processarNotas();
	}

}
