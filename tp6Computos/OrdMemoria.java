package tp6Computos;

public class OrdMemoria extends CantMemoria {

	public OrdMemoria(int memoria, String nombre) {
		super(memoria, nombre);
		// TODO Auto-generated constructor stub
	}
	public boolean compare(CantMemoria c1, CantMemoria c2) {
		return c1.getRapidez()<c2.getRapidez();
	}
}
