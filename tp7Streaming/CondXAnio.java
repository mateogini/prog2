package tp7Streaming;

public class CondXAnio implements Condicion{
	private int anio;
	
	public CondXAnio(int anio) {
		this.anio=anio;
	}

	@Override
	public boolean cumple(Pelicula pel) {
		return pel.getAnio()>(this.anio);
	}
	
}
