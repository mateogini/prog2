package tp2punto2;

public class Episodio {
	private String titulo;
	private String descripcion;
	private boolean vista;
	private int calificacion;
//constructor

public Episodio(String titulo, String descripcion,int calificacion, boolean vista) {
	this.titulo=titulo;
	int valor = calificacion;
	if((valor>=0&&valor<=5)&&(vista==true)) {
		this.calificacion=calificacion;
		this.vista=vista;
	}
	else if((valor<0&&valor>-5)&&(vista==false)) {
		this.calificacion=calificacion;
		this.vista=vista;}
	else {
		System.out.println("no se pudo calificar");
	}
	this.descripcion=descripcion;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public boolean isVista() {
	return vista;
}
public int getCalificacion() {
	return calificacion;
}
public Episodio(int calificacion, boolean vista) {
	int valor = calificacion;
	if((valor>=0&&valor<=5)&&(vista==true)) {
		this.calificacion=calificacion;
		this.vista=vista;
	}
	else if((valor<0&&valor>-5)&&(vista==false)) {
		this.calificacion=calificacion;
		this.vista=vista;}
	else {
		System.out.println("no se pudo calificar");
	}
}
public String datos() {
	return titulo + "," + vista +"," + calificacion;
}

public static void main (String[]args) {
	Episodio uno = new Episodio(2,false);
	
	System.out.println(uno.datos());
}
}
