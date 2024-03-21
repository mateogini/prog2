package tp4P4YP5;

import java.time.LocalDate;

public class Masajista extends Integrante {
	private String titulo;
	private int experiencia;
	public Masajista(String nombre, String apellido, int pasaporte, LocalDate fechanac, boolean concentra, boolean paisdeorigen) {
		super(nombre, apellido, pasaporte, fechanac, concentra, paisdeorigen);
		// TODO Auto-generated constructor stub
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	

}
