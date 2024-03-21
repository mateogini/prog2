package tp6Computos;

import java.util.ArrayList;


public abstract class CentroDeComputo {
	protected ArrayList<CantMemoria>procesos;

	public CentroDeComputo() {
		procesos = new ArrayList<>();
	}
	
	public void add(CantMemoria c1) {
		int i= 0;
		while(i<procesos.size()) {
			if(compare(c1, procesos.get(i))){
				i++;
			}
			procesos.add(i, c1);
		}
	}
	public abstract boolean compare(CantMemoria c1, CantMemoria c2);
	
	
}
