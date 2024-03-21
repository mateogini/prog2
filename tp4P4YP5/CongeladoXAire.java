package tp4P4YP5;

import java.time.LocalDate;

public class CongeladoXAire extends Refrigerado {
	private int nitrogeno;
	private int oxigeno;
	private int dioxido;
	private int vaporDeAgua;
	public CongeladoXAire(LocalDate fecha_venc, int nroLote, LocalDate fechaEnvase, String granja, int cosa,
			double tempRec, int nitrogeno, int oxigeno, int dioxido, int vaporDeAgua) {
		super(fecha_venc, nroLote, fechaEnvase, granja, cosa, tempRec);
		this.nitrogeno = nitrogeno;
		this.oxigeno = oxigeno;
		this.dioxido = dioxido;
		this.vaporDeAgua = vaporDeAgua;
	}

	

}
