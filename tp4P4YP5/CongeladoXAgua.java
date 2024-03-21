package tp4P4YP5;

import java.time.LocalDate;

public class CongeladoXAgua extends Refrigerado {
	private int salXAgua;

	public CongeladoXAgua(LocalDate fecha_venc, int nroLote, LocalDate fechaEnvase, String granja, int cosa,
			double tempRec, int salXAgua) {
		super(fecha_venc, nroLote, fechaEnvase, granja, cosa, tempRec);
		this.salXAgua = salXAgua;
	}
	
	

	
}
