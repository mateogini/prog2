package tp7Streaming;

public class CondXTitulo implements Condicion {
	private String titulo;
	
	public CondXTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public boolean cumple(Pelicula pel) {
		return pel.getNombre().contains(this.titulo);
	}

}
