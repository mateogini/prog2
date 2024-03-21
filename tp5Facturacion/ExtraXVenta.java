package tp5Facturacion;

public class ExtraXVenta extends Empleado{
	private double extra;
	private int ventas;	
	
	public ExtraXVenta(String nombre, String apellido, int dni, double sueldoFijo) {
		super(nombre, apellido, dni, sueldoFijo);
		// TODO Auto-generated constructor stub
	}


	public double sueldoTotal(double extra, int ventas) {
		return super.getSueldoFijo() + (extra*ventas);
	}

}
