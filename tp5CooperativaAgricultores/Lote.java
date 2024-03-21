package tp5CooperativaAgricultores;
import java.util.ArrayList;

public class Lote {
	private ArrayList<String>minerales;
	private int hectareas;
	private boolean especial;
	public Lote(int hectareas, boolean especial) {
		this.hectareas=hectareas;
		this.especial=especial;
		this.minerales= new ArrayList<>();
	}
	public int getHectareas() {
		return hectareas;
	}
	public void setHectareas(int hectareas) {
		this.hectareas = hectareas;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public ArrayList<String> getMinerales(){
		ArrayList<String> aux = new ArrayList<>();
		aux=minerales;
		return aux;
		
	}
	
	public void addMineral(String m) {
		minerales.add(m);
	}
	
	public boolean siembra(Cereal a) {
				if(minerales.containsAll(a.getMinerales())) {
					return true;
				}
				return false;
	}

}
