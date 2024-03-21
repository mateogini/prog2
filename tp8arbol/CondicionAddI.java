package tp8arbol;

public class CondicionAddI implements Condicion{

	public boolean cumple(Nodo n1, Nodo n2) {
		return n1.getNumero()< n2.getNumero	();
	}

}
