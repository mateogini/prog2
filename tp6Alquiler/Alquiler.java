package tp6Alquiler;


public abstract class Alquiler {
	private String titulo;
	private String marca;
	private String patente;
	public Alquiler(String titulo) {
		this.titulo=titulo;
	}
	public Alquiler(String marca, String patente) {
		this.marca=marca;
		this.patente=patente;
	}
	

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public abstract boolean disponible();
	public abstract boolean cantidad();
	
}
