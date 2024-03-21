package tp5Sombrero;
import java.util.ArrayList;


public class Alumno extends Casa{
	private String nombre;
	private boolean asignado;
	private ArrayList<String>cualidades;
	private ArrayList<Alumno>familia;
	
	public Alumno(String nombre, boolean asignado) {
		this.nombre=nombre;
		this.asignado=asignado;
		cualidades= new ArrayList<>();
		familia= new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isAsignado() {
		return asignado;
	}
	public void setAsignado(boolean asignado) {
		this.asignado = asignado;
	}
	
	public void addCualidad(String cualidad) {
		cualidades.add(cualidad);
	}
	
	public ArrayList<String> getCualidad() {
		ArrayList aux = new ArrayList<>();
		aux=cualidades;
		return aux;
	}
	
	public void addFamiliar(Alumno a) {
		familia.add(a);
	}
	public ArrayList<Alumno> getFamilia() {
		ArrayList<Alumno> aux = new ArrayList<>();
		aux=familia;
		return aux;
	}
	

}
