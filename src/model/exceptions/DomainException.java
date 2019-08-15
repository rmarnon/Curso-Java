package model.exceptions; //Convencao, a excecao sera algum erro lancada na entidade de dominio (main)

public class DomainException extends RuntimeException{
	
	private static final long serialVersionUID = 1L; 

	public DomainException(String msg) {
		super(msg);
	}
	
}
