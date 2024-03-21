package tp4P4YP5;
import java.time.LocalDate;

public class Producto {
	private LocalDate fecha_venc;
	private int nroLote;
	public Producto(LocalDate fecha_venc, int nroLote) {
		this.fecha_venc = fecha_venc;
		this.nroLote = nroLote;
	}
	public LocalDate getFecha_venc() {
		return fecha_venc;
	}
	public void setFecha_venc(LocalDate fecha_venc) {
		this.fecha_venc = fecha_venc;
	}
	public int getNroLote() {
		return nroLote;
	}
	public void setNroLote(int nroLote) {
		this.nroLote = nroLote;
	}
	

	

}
