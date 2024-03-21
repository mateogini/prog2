package tp8arbol;

public class Arbol {

	public static void main (String args[]) {
		Nodo raiz = new Nodo(8);
		Nodo nodo3 = new Nodo(3);
		Nodo nodo10 = new Nodo(10);
		Nodo nodo1 = new Nodo(1);
		Nodo nodo6 = new Nodo(6);
		Nodo nodo14 = new Nodo(14);
		Nodo nodo13 = new Nodo(13);
		Nodo nodo4 = new Nodo(4);
		Nodo nodo7 = new Nodo(7);
		Nodo nodoprueba = new Nodo(10);
		AccionEjecutable imp = new ImprimirEnOrden();

		
		raiz.addIzq(nodo3);
		raiz.addDer(nodo10);
		
		nodo3.addIzq(nodo1);
		nodo3.addDer(nodo6);
		
		nodo6.addIzq(nodo4);
		nodo6.addDer(nodo7);
		
		nodo10.addDer(nodo14);
		
		nodo14.addIzq(nodo13);
		nodo14.addIzq(nodoprueba);
		
		imp.ejecutarNodo(raiz);
		
		
	}
}
