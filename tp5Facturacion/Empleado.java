package tp5Facturacion;

public class Empleado extends Empresa{
	private String nombre;
	private String apellido;
	private int dni;
	private double sueldoFijo;
	public Empleado(String nombre, String apellido, int dni, double sueldoFijo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldoFijo = sueldoFijo;
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public double getSueldoFijo() {
		return sueldoFijo;
	}
	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}
	@Override
	public double sueldoTotal() {
		// TODO Auto-generated method stub
		return sueldoFijo;
	}
	
	
	
}
