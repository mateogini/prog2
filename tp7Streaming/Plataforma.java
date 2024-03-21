package tp7Streaming;

import java.util.ArrayList;


public class Plataforma {
	private ArrayList<Pelicula>stock;
	
	
	public Plataforma() {
		stock = new ArrayList<>();
	}
	
	public ArrayList<Pelicula> buscar(Condicion c1){
		ArrayList<Pelicula> aux = new ArrayList<>();
		for(int i = 0; i<this.stock.size();i++) {
			Pelicula pel = this.stock.get(i);
			if(c1.cumple(pel)) {
				aux.add(pel);
			}
		}
		return aux;
	}
	public void addPel(Pelicula p) {
		stock.add(p);
	}
	public ArrayList<Pelicula> buscarY(Condicion c1, Condicion c2){
		ArrayList<Pelicula> aux = new ArrayList<>();
		ArrayList<Pelicula> ret = new ArrayList<>();
		for(int i = 0; i<this.stock.size();i++) {
			Pelicula pel = this.stock.get(i);
			if(c1.cumple(pel)) {
				aux.add(pel);
			}
		}
		for(int i = 0; i<aux.size();i++) {
			Pelicula peli = aux.get(i);
			if(c2.cumple(peli)) {
				ret.add(peli);
			}
		}
		return ret;
	}
}
