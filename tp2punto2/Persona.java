package tp2punto2;

public class Persona {
private String nombre;
private String mail;
private int numero;



public Persona(String nombre, String mail, int numero) {
	this.nombre=nombre;
	this.mail=mail;
	this.numero=numero;
}
public Persona(String mail, int numero) {
	this.mail=mail;
	this.numero=numero;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}

}
