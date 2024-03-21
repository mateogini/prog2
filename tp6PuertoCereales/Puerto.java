package tp6PuertoCereales;

import java.util.ArrayList;


public class Puerto {
	protected ArrayList<Transporte>camiones;
	protected ArrayList<Transporte>barcos;
	
	
	public Puerto() {
		this.camiones= new ArrayList<>();
		this.barcos= new ArrayList<>();

	}
	/*public ArrayList ordenarX(Transporte b) {
		ArrayList aux = new ArrayList<>();
		for(int i = 0; i<camiones.size();i++)
			if(b.cumple(camiones.get(i)))
			
		
	}*/

}
