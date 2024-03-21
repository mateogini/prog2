package tp7Streaming;

public class CondXGenero implements Condicion{
	private String genero;
	
	public CondXGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public boolean cumple(Pelicula pel) {
		return pel.getGeneros().contains(this.genero);
	}

}
