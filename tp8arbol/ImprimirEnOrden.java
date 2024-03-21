
package tp8arbol;

public class ImprimirEnOrden implements AccionEjecutable{

	@Override
	public void ejecutarNodo(Nodo nodo) {
        System.out.print(((Nodo) nodo).getNumero() + " ");
	}

}
