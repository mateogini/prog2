package tp7Streaming;

import java.util.ArrayList;

public class Pelicula {
	private String nombre;
	private String sinopsis;
	private ArrayList<String>generos;
	private String director;
	private ArrayList<String>actores;
	private int anio;
	private int duracion;
	private int edadMin;
	public Pelicula(String nombre, String sinopsis, String director, int anio, int duracion, int edadMin) {
		this.nombre = nombre;
		this.sinopsis = sinopsis;
		this.generos = new ArrayList<>();
		this.director = director;
		this.actores = new ArrayList<>();
		this.anio = anio;
		this.duracion = duracion;
		this.edadMin = edadMin;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int año) {
		this.anio = año;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getEdadMin() {
		return edadMin;
	}
	public void setEdadMin(int edadMin) {
		this.edadMin = edadMin;
	}
	public ArrayList<String> getActores(){
		ArrayList<String> aux = actores;
		return aux;
	}
	public ArrayList<String> getGeneros(){
		ArrayList<String> aux = generos;
		return aux;
	}
	public void setActores(String a){
		actores.add(a);
	}
	public void setGenero(String a){
		generos.add(a);
	}
	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", sinopsis=" + sinopsis + ", generos=" + generos + ", director="
				+ director + ", actores=" + actores + ", año=" + anio + ", duracion=" + duracion + ", edadMin=" + edadMin
				+ "]";
	}
	
	
}
