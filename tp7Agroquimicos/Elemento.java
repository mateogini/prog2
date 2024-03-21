package tp7Agroquimicos;
import java.util.ArrayList;

public class Elemento extends Empresa {
	private String nombre;
	protected ArrayList<Elemento>estados;


	public Elemento(String nombre) {
		this.nombre=nombre;
		this.estados= new ArrayList<>();
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void addEst(Elemento e) {
		estados.add(e);
	}
	public String toString() {
		return nombre;
	}
	
	
}