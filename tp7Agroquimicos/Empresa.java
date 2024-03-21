package tp7Agroquimicos;

import java.util.ArrayList;

public  class Empresa {
	private ArrayList<Quimico>quimicos;

	
	public Empresa() {
		this.quimicos=new ArrayList<>();
		
	}
	public ArrayList<Quimico> puedeTratar(Elemento e) {
		ArrayList<Quimico> aux = new ArrayList<>();
		for(int i = 0; i<quimicos.size();i++) {
			if(quimicos.get(i).cumple(e)) {
				aux.add(quimicos.get(i));
			}
		}
		return aux;
		
	}
	public ArrayList<Quimico> puedeTratarEyC(Elemento e1, Elemento e2) {
		ArrayList<Quimico> aux = new ArrayList<>();
		for(int i = 0; i<quimicos.size();i++) {
			if(quimicos.get(i).cumple(e1, e2)) {
				aux.add(quimicos.get(i));
			}
		}
		return aux;
		
	}
	public void addQ(Quimico q) {
		quimicos.add(q);
	}
}
