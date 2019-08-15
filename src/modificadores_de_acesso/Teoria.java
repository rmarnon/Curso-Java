package modificadores_de_acesso;

public @interface Teoria {
	/*
	 *  (-)  Private ->  So pode ser acessado na propria classe.
	 *  
	 * 
	 *  ( )    NADA ->  So pode ser acessada nas classes do mesmo pacote.
	 *  
	 * 
	 * (#) Protected ->  So pode ser acesasdo no mesmo pacote, bem como subclasses de pacotes diferentes.
	 * 
	 * 
	 *  (+)   Public ->  Pode ser acessado por todas as classes (Ao menos que ele resida em um modulo
	 *  			     diferente, que nao exporte o pacote onde ele esta).  
	 *  
	 */
}
