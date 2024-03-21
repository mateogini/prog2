package tp4P1YP2;

public class EmpleadoporComision extends Empleado {
	private int ventas;
	private double comision;
	public EmpleadoporComision(String nombre, int dni, int ventas, double comision) {
		super(nombre, dni);
		this.ventas=ventas;
		this.comision=comision;
	}
	// como sacar comision xd
	public int getSueldo() {
		return (int) (super.getSueldo()+ventas*comision);
	}

}
