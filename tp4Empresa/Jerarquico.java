package tp4Empresa;
import java.util.ArrayList;

public class Jerarquico extends Persona {
	private int sueldo;
	private int legajo;
	private ArrayList<Empleado> empleados;
	public Jerarquico(String nombre, String apellido, int edad, int legajo, int sueldo) {
		super(nombre, apellido, edad);
		this.sueldo=sueldo;
		this.legajo=legajo;
		this.empleados= new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public void addEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public void getEmpleados() {
		
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
			}
	}
	

}
