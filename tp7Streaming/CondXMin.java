package tp7Streaming;

public class CondXMin implements Condicion{
	private int minutos;
	
	public CondXMin(int minutos) {
		this.minutos=minutos;
	}
	@Override
	public boolean cumple(Pelicula pel) {
		return pel.getDuracion()<minutos;
	}

}
