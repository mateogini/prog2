package tp7Streaming;

public class CondXActor implements Condicion{
	private String actor;
	
	public CondXActor(String actor) {
		this.actor = actor;
	}

	@Override
	public boolean cumple(Pelicula pel) {
		return pel.getActores().contains(this.actor);
	}
}
