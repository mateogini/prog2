package tp6Alquiler;

public class Pelicula extends Alquiler{
	private String info;
	private int cantDeCopias;
	public Pelicula(String titulo, String info, int copias) {
			super(titulo);
			this.info=info;
			this.cantDeCopias=copias;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public int getCantDeCopias() {
		return cantDeCopias;
	}
	public  void setCantDeCopias(int cantDeCopias) {
		this.cantDeCopias = cantDeCopias;
	}

	public boolean disponible() {
		return cantDeCopias>0;
	}
	public boolean cantidad() {
		if(cantDeCopias>0) {
			this.cantDeCopias= cantDeCopias-1;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString () {
		return super.getTitulo() + " " + cantDeCopias;
	}
}
