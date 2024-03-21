package tp5CooperativaAgricultores;

import java.util.ArrayList;

public class Cereal {
	private String nombre;
	private String tipo;
	private ArrayList<String>minerales;
	public Cereal(String nombre, String tipo) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.minerales= new ArrayList<>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public ArrayList<String> getMinerales(){
		ArrayList<String> aux = new ArrayList<>();
		aux=minerales;
		return aux;
		
	}
	public void addMineral(String m) {
		minerales.add(m);
	}
	public boolean sembrarse(Lote a) {
		if(minerales.containsAll(a.getMinerales())) {
			return true;
		}
		return false;
	}

}
