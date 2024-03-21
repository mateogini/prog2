package tp7Documentos;


public class CondicionXNoClave implements Condicion {
	private String clave;
	
	public CondicionXNoClave(String clave) {
		this.clave=clave;
	}
	@Override
	public boolean cumple(Documento doc) {
		return !doc.claves().contains(clave);
	}

}
