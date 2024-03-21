package tp8arbol;

import java.util.ArrayList;

public class Nodo {
	private int numero;
	private Nodo padre;
	private Nodo derecha;
	private Nodo izquierda;
	
	public Nodo(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Nodo getPadre() {
		return padre;
	}

	public void setPadre(Nodo padre) {
		this.padre = padre;
	}
	
	
	public String toString() {
		if(this.derecha==null && this.izquierda==null) {
			return numero + "\n";

		}
		if(this.izquierda==null) {
			return numero+ "derecha: " + this.derecha + "\n" ;
		}
		else if(this.derecha==null) {
			return numero + "izquierda: " + this.izquierda + "\n";
		}
		
		return numero + " izquierda: " + this.izquierda + " derecha: " + this.derecha + "\n";

	}
	
	
	public void addIzq(Nodo n) {
		Condicion c1 = new CondicionAddI();
		if(c1.cumple(n,this)) {
			this.izquierda=n;
			n.setPadre(this);
		}
	}
	public void addDer (Nodo n) {
		Condicion c1 = new CondicionAddD();
		if(c1.cumple(n,this)) {
			if((this.padre==null)||(n.getNumero()!=this.padre.getNumero())) {
			this.derecha=n;
			n.setPadre(this);
			}
		}

	}
	public Nodo getIzq() {
		return this.izquierda;
	}
	public Nodo getDer() {
		return this.derecha;
	}
	public void recorridoEnOrdenConAccion(AccionEjecutable accion) {
        recorridoEnOrdenConAccionRec(this, accion);
    }

    private void recorridoEnOrdenConAccionRec(Nodo nodo, AccionEjecutable accion) {
        if (nodo != null) {
            recorridoEnOrdenConAccionRec(nodo.izquierda, accion);
            accion.ejecutarNodo(nodo);
            recorridoEnOrdenConAccionRec(nodo.derecha, accion);
        }
    }
	

}
