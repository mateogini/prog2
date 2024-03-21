package tp4P4YP5;

import java.time.LocalDate;

public class CongeladoXNitrogeno extends Refrigerado {
	private String metodo;
	private int exposicion;
	public CongeladoXNitrogeno(LocalDate fecha_venc, int nroLote, LocalDate fechaEnvase, String granja, int cosa,
			double tempRec, String metodo, int exposicion) {
		super(fecha_venc, nroLote, fechaEnvase, granja, cosa, tempRec);
		this.metodo = metodo;
		this.exposicion = exposicion;
	}
	public String getMetodo() {
		return metodo;
	}
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
	public int getExposicion() {
		return exposicion;
	}
	public void setExposicion(int exposicion) {
		this.exposicion = exposicion;
	}
	
	public String ToString() {
		return "granja: " + super.getGranja() + " fecha de envasado: " + super.getFechaEnvase() + " numero de lote: " + super.getNroLote();
	}

}
