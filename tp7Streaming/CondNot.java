package tp7Streaming;


public class CondNot implements Condicion{
	private Condicion c1;
	private Condicion c2;
	
	public CondNot(Condicion c1, Condicion c2) {
		this.c1=c1;
		this.c2=c2;
	}

	@Override
	public boolean cumple(Pelicula pel) {
		return (!c1.cumple(pel) && !c2.cumple(pel));  
	}
	
}