package tp7Streaming;

public class CondXDir implements Condicion{
	private String director;
	
	public CondXDir(String director) {
		this.director = director;
	}
	@Override
	public boolean cumple(Pelicula pel) {
		return pel.getDirector().contains(this.director);
	}

}
