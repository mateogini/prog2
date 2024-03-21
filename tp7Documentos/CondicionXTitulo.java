package tp7Documentos;

public class CondicionXTitulo implements Condicion {
	private String titulo;
	public CondicionXTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean cumple(Documento doc) {
		return doc.getTitulo().contains(this.titulo);
	}
	
}
