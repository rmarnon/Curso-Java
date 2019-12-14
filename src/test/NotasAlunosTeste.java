package test;

public class NotasAlunosTeste {

	public static void main(String[] args) {
		
		int[] notas = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		
		NotasAlunos  minhasNotas = new NotasAlunos("Curso de Java", notas);
		
		System.out.printf("Livro de notas para o curso: %n%s%n%n", minhasNotas.getCurso());
		minhasNotas.processarNotas();
	}

}
