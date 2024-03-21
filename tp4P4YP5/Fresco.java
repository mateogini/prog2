package tp4P4YP5;
import java.time.LocalDate;

public class Fresco extends Producto {
	private LocalDate fechaEnvase;
	private String granja;
	public Fresco(LocalDate fecha_venc, int nroLote, LocalDate fechaEnvase, String granja) {
		super(fecha_venc, nroLote);
		this.fechaEnvase = fechaEnvase;
		this.granja = granja;
	}
	public LocalDate getFechaEnvase() {
		return fechaEnvase;
	}
	public void setFechaEnvase(LocalDate fechaEnvase) {
		this.fechaEnvase = fechaEnvase;
	}
	public String getGranja() {
		return granja;
	}
	public void setGranja(String granja) {
		this.granja = granja;
	}

}
