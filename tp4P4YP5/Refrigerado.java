package tp4P4YP5;

import java.time.LocalDate;

public class Refrigerado extends Fresco {
	private int cosa;
	private double tempRec;
	public Refrigerado(LocalDate fecha_venc, int nroLote, LocalDate fechaEnvase, String granja, int cosa,
			double tempRec) {
		super(fecha_venc, nroLote, fechaEnvase, granja);
		this.cosa = cosa;
		this.tempRec = tempRec;
	}
	public int getCosa() {
		return cosa;
	}
	public void setCosa(int cosa) {
		this.cosa = cosa;
	}
	public double getTempRec() {
		return tempRec;
	}
	public void setTempRec(double tempRec) {
		this.tempRec = tempRec;
	}
	

}
