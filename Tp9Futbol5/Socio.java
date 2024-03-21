package Tp9Futbol5;

import java.util.ArrayList;


public class Socio implements Comparable<Socio>{
	private String nombre;
	private String apellido;
	private int edad;
	private boolean cuotaPaga;
	protected ArrayList<Alquiler>alquileres;
	public Object cantAlquileres;
	public Socio(String nombre, String apellido, int edad, boolean cuotaPaga) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.cuotaPaga = cuotaPaga;
		this.alquileres = new ArrayList<>();
	}
	public String toString() {
		return "nombre: " + nombre + " edad: "+ edad + " cant de alquileres: " + alquileres.size();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isCuotaPaga() {
		return cuotaPaga;
	}
	public void setCuotaPaga(boolean cuotaPaga) {
		this.cuotaPaga = cuotaPaga;
	}
	public void addAlquiler(Alquiler a) {
		alquileres.add(a);
	}
	public Alquiler getAlquiler(Alquiler a) {
		for(Alquiler alq:alquileres) {
			if(alq.equals(a)) {
				return alq;
			}
		}
		return null;
	}
	public ArrayList<Alquiler> alquileres(){
		ArrayList<Alquiler> aux = new ArrayList<>();
		for(Alquiler alq:alquileres){
			aux.add(alq);
		}
		return aux;
	}
	public int cantAlquileres(){
		return alquileres.size();
	}
	

	@Override
	public int compareTo(Socio o) {
		return this.alquileres.size( )- o.alquileres.size();
	}
	
	
	

}
