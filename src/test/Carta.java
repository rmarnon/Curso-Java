package test;

public class Carta {

	private String remetente;
	private String destinatario;
	private String text = "\n";
	
	public Carta(String remetente, String destinatario) {
		this.remetente = remetente;
		this.destinatario = destinatario;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public String getText() {
		return "Prezado(a) ".concat(destinatario).concat(":\n") + text + "\n" + "Atenciosamente, " + "\n" + remetente; 
	}
	
	public void addText(String line) {
		text += line.concat("\n");
	}
}
