package tp6Alquiler;

public class Vehiculo extends Alquiler{
	private int km;
	private String tipo;
	private  boolean alquilado;
	public Vehiculo(String marca, int km, String patente, String tipo, boolean alquilado) {
		super(marca,patente);
		this.km=km;
		this.tipo=tipo;
		this.alquilado=alquilado;
	}
	
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public boolean disponible() {
		return alquilado;
	}
	public boolean cantidad() {
		if(!alquilado) {
			this.alquilado=false;
			return true;
		}
		return false;
	}
	public String toString() {
		return super.getMarca() + alquilado;
	}
}
