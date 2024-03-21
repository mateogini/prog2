package tp4Empresa;

public class Empleado extends Jerarquico {

	public Empleado(String nombre, String apellido, int edad, int legajo, int sueldo) {
		super(nombre, apellido, edad, legajo, sueldo);
		// TODO Auto-generated constructor stub
	}
	public String toString() {
	    return "Nombre: " + super.getNombre() + ", Edad: " + super.getEdad() + " Legajo " + super.getLegajo(); 
	}
}
