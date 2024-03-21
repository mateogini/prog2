package tp7Documentos;

import java.util.ArrayList;

public class Documento {
	private String titulo;
	private ArrayList<String>autores;
	private String contenido;
	private ArrayList<String>palClav;
	
	
	public Documento (String titulo, String contenido) {
		this.titulo=titulo;
		this.contenido = contenido;
		this.autores=new ArrayList<>();
		this.palClav = new ArrayList<>();
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getContenido() {
		return contenido;
	}


	public void setContenido(String contenido) {
		this.contenido = contenido;
	}


	@Override
	public String toString() {
		return "Documento [titulo=" + titulo + ", autores=" + autores + ", contenido=" + contenido + ", palClav="
				+ palClav + "]";
	}
	public void addAutor(String a) {
		autores.add(a);
	}
	public void addClave(String p) {
		palClav.add(p);
	}
	public ArrayList<String> claves(){
		ArrayList<String> claves = this.palClav;
		return claves;
		
	}
}
