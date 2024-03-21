package tp6PuertoCereales;
import java.util.Date;


public class Camion extends Transporte {
	private int patente;
	private Date fecha;
	
	public Camion(int patente, Date fecha) {
		this.patente=patente;
		this.fecha=fecha;
	}

	public int getPatente() {
		return patente;
	}

	public void setPatente(int patente) {
		this.patente = patente;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
}
