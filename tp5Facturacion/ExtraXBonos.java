package tp5Facturacion;

public class ExtraXBonos extends Empleado {
	private int ventas;
	private int bono;
	private int ventasReq;
	
	
	public ExtraXBonos(String nombre, String apellido, int dni, double sueldoFijo, int ventasReq) {
		super(nombre, apellido, dni, sueldoFijo);
		this.ventasReq=ventasReq;
		// TODO Auto-generated constructor stub
	}
	
	public double sueldoTotal(double bono, int ventas) {
		if(ventasReq<=ventas) {
		return super.getSueldoFijo()+ bono;
		}
		return super.getSueldoFijo();
		}
}

