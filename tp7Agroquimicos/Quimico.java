package tp7Agroquimicos;
import java.util.ArrayList;

public class Quimico extends Empresa {
	private String nombre;
	private ArrayList<Elemento>cultivosNo;
	private ArrayList<Elemento>estados;
	 
	
	public Quimico(String n){
		this.nombre=n;
		this.cultivosNo=new ArrayList<>();
		this.estados=new ArrayList<>();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean cumple(Elemento e) {
		return this.estados.containsAll(e.estados);
	}
	public boolean cumple(Elemento e1, Elemento e2) {
		return (this.estados.containsAll(e1.estados) && !this.estados.containsAll(e2.estados));
	}
	public void addEst(Elemento e) {
		estados.add(e);
	}
	
	public void addCult(Elemento e) {
		cultivosNo.add(e);
	}
	public String toString(){
		return nombre;
	}
	
}
