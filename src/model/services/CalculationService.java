package model.services;

import java.util.List;

public class CalculationService {//Nao esta parametrizada o tipo T, somente o metodo esta, entao <T>

	public static <T extends Comparable<T>> T max(List<T> list) {
		//<T> diz que esse metodo trabalha com algum tipo T
		//<T extends Comparable<T>> Especifica que o tipo T eh da interface Comparable
		//Qualquer tipo T "par" trabalhara com qualquer tipo T desde que T seja subtipo de comparable<T>
		//Ideal <T extends Comparable<? super T>> Tipo comparable T ou Qaulquer superclasse de T
		
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);//Variavel max do tipo "T"
		for (T p : list) {//Pra usar o metodo compareTo, deve especificar que T eh do tipo Comparable
			if (p.compareTo(max) > 0) {
				max = p;
			}
		}
		return max;
	}
	
}
