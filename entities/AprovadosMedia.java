package entities;

public class AprovadosMedia {
	private double notaUm;
	private double notaDois;
	private String nome;
	public AprovadosMedia() {
		
	}
	public double getNotaUm() {
		return notaUm;
	}
	public void setNotaUm(double notaUm) {
		this.notaUm = notaUm;
	}
	public double getNotaDois() {
		return notaDois;
	}
	public void setNotaDois(double notaDois) {
		this.notaDois = notaDois;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public AprovadosMedia(double notaUm, double notaDois, String nome) {
		super();
		this.notaUm = notaUm;
		this.notaDois = notaDois;
		this.nome = nome;
	}
	
	
}
