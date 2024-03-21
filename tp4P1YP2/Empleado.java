package tp4P1YP2;

public class Empleado {
	private String nombre;
	private int dni;
	private int sueldo;
	
	
	public Empleado(String nombre, int dni) {
		this.nombre=nombre;
		this.dni=dni;
		this.sueldo=10000;
	}

	public int sueldo() {
		return 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	public static void main (String[]args) {
		Empleado emp1 = new EmpleadoPorHora(200,1);
		Empleado emp2 = new EmpleadoporComision("Mateo", 45460, 5, 0.10);
		Empleado emp3 = new Empleado("Mateo", 45460217);
		
		System.out.println(emp2.getSueldo());
	}
}
