package tp5CooperativaAgricultores;

import java.util.ArrayList;

public class Pastura extends Cereal {
	private static int hectareasMin=50;
	private ArrayList<String>minerales;

	public Pastura(String nombre, String tipo) {
		super(nombre, tipo);
		minerales=new ArrayList<>();
		
		// TODO Auto-generated constructor stub
	}

	public void addMineral(String m) {
		minerales.add(m);
	}
	public boolean sembrarse(Lote a) {
		if(minerales.containsAll(a.getMinerales())&&(a.getHectareas()>=hectareasMin)){
			return true;
		}
		return false;
	}
	
}
