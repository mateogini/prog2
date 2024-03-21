package tp4P1YP2;

public class EmpleadoPorHora extends Empleado {
	private int extra;
	private int horas;
	public EmpleadoPorHora(int extra,int horas) {
		super("Mateo",45450);
		this.horas=horas;
		this.extra=extra;
		
		}
	
	public int getSueldo() {
		return super.getSueldo()+ extra*horas;
	}

}
