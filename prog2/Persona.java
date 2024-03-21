package prog2;
import java.time.LocalDate;


public class Persona {
private String nombre;
private String apellido;
private int edad;
private LocalDate fecha_nacimiento;
private int dni;
private String sexo;
private double peso;
private double altura;

// getters and setters //
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public double getPeso() {
	return peso;
}
public void setPeso(double peso) {
	this.peso = peso;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
public int getDni() {
	return dni;
}
public String getSexo() {
	return sexo;
}

public LocalDate getFecha_nacimiento() {
	return fecha_nacimiento;
}
public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
	this.fecha_nacimiento = fecha_nacimiento;
}
// constructores//
public Persona(int nuevoDni) {
	this(nuevoDni,LocalDate.of(2000, 01, 01),"N","N",1,1,"femenino");
}


public Persona(int dni, LocalDate fecha_nacimiento, String nombre, String apellido, double altura, double peso, String sexo) {
	this.dni=dni;
	this.fecha_nacimiento=fecha_nacimiento;
	this.nombre=nombre;
	this.apellido=apellido;
	this.altura=altura;
	this.peso=peso;
	this.sexo=sexo;
			}
public Persona(double peso, double altura){
	this.peso=peso;
	this.altura=altura;
}
//METODOS
public String getDatosCompletos() {
	return nombre +"," +apellido +","+ dni +","+ altura + ","+ peso + "," + fecha_nacimiento + ","+ edad +","+ sexo;
}
	public double getIMC() {
		return  peso/(altura*altura);
	}
	public boolean estaEnForma() {
		if((getIMC()>18.5)&&(getIMC()<25)){
			return true;
		}
		else {
			return false;
		}
	}
}


