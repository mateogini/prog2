package tp6Alquiler;

import java.util.Date;
import java.time.LocalDate;


public class Videoclub {
	private Cliente cliente;
	private Alquiler item;
	private LocalDate fechaDev;
	private LocalDate fechaIni;
	public Videoclub(Cliente cliente, Alquiler item, LocalDate fechaDev, LocalDate fechaIni) {
		this.cliente = cliente;
		this.item = item;
		this.fechaDev = fechaDev;
		this.fechaIni = fechaIni;
	}
	
	
}
