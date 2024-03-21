package tp2punto2;
import java.util.ArrayList;

public class Agenda {
	private String tema;
	private String ubicacion;
	private int duracion;
	private  ArrayList<Persona> personas;
	
	
	
public Agenda(String tema, String ubicacion, int duracion, int cantPersonas) {
	this.tema=tema;
	this.ubicacion=ubicacion;
	this.duracion=duracion;
	this.personas= new ArrayList<Persona>();
}
public void addPersona(Persona nuevaPerso ) {
	this.personas.add(nuevaPerso);
}

public String getTema() {
	return tema;
}
public void setTema(String tema) {
	this.tema = tema;
}
public String getUbicacion() {
	return ubicacion;
}
public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}


public int getDuracion() {
	return duracion;
}
public void setDuracion(int duracion) {
	this.duracion = duracion;
}


public static void main (String[]args) {
	
	Persona lucas= new Persona("Lucas","hola@gmail.com",222);
	
	Agenda reunion1= new Agenda("Desarrollo", "Tandil", 20,10);
	
	reunion1.addPersona(lucas);
	

	
}
}
