package tp7Documentos;

import java.util.ArrayList;

public  class Digitalizacion {
	ArrayList<Documento>documentos;
	
	public Digitalizacion() {
		this.documentos=new ArrayList<>();

	}
	public ArrayList<Documento> buscar(Condicion c1) {
		ArrayList<Documento> aux = new ArrayList<>();
			for(int i = 0; i<this.documentos.size();i++) {
				Documento doc = this.documentos.get(i);
				if(c1.cumple(doc)) {
					aux.add(doc);
				}
			}
			return aux;
	
	}
	public void addDocu(Documento d) {
		this.documentos.add(d);
	}
	public void eliminarDoc(int i) {
		this.documentos.remove(i);
	}
}
