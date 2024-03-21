package tp8arbol;

public class CondicionAddD implements Condicion{

	
	public boolean cumple(Nodo nodo, Nodo nodo2) {
		return nodo.getNumero()> nodo2.getNumero();
		}
	

}
