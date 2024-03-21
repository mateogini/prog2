package tp4P4YP5;
import java.time.*;

public class Integrante {
	private String nombre;
	private String apellido;
	private int pasaporte;
	private LocalDate fechanac;
	private boolean concentra;
	private boolean paisdeorigen;
	public Integrante(String nombre, String apellido, int pasaporte, LocalDate fechanac, boolean concentra, boolean paisdeorigen) {
				this.nombre=nombre;
				this.apellido=apellido;
				this.pasaporte=pasaporte;
				this.fechanac=fechanac;
				this.concentra=concentra;
				this.paisdeorigen=paisdeorigen;
		
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
	public int getPasaporte() {
		return pasaporte;
	}
	public void setPasaporte(int pasaporte) {
		this.pasaporte = pasaporte;
	}
	public LocalDate getFechanac() {
		return fechanac;
	}
	public void setFechanac(LocalDate fechanac) {
		this.fechanac = fechanac;
	}
	public boolean isConcentra() {
		return concentra;
	}
	public void setConcentra(boolean concentra) {
		this.concentra = concentra;
	}
	public boolean isPaisdeorigen() {
		return paisdeorigen;
	}
	public void setPaisdeorigen(boolean paisdeorigen) {
		this.paisdeorigen = paisdeorigen;
	}
	public boolean dispo(){
	return false;
	}
	public static void main(String[]args){
	Integrante yo = new Futbolista("Mateo", "Gini", 200, LocalDate.of(2000, 01, 01), true, true);
	Masajista yo2 = new Masajista ("Mateo", "Gini", 200, LocalDate.of(2000, 01, 01), true, false);
	yo2.setExperiencia(2);
	System.out.println(yo.dispo());		
}
}
