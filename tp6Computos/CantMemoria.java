package tp6Computos;
import java.util.ArrayList;

public  class CantMemoria extends CentroDeComputo{
	private String nombre;
	private int memoria;
	public CantMemoria(int rapidez, String nombre) {
		this.memoria=rapidez;
		this.nombre=nombre;
		
	}
	public int getRapidez() {
		return memoria;
	}

	public void setRapidez(int rapidez) {
		this.memoria = rapidez;
	}
	
	public boolean compare(CantMemoria c1, CantMemoria c2) {
		return c1.getRapidez()<c2.getRapidez();
	}
	
	
}
