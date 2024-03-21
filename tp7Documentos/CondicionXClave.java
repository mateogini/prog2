package tp7Documentos;

public class CondicionXClave implements Condicion {
	private String clave;
	
	public CondicionXClave(String clave) {
		this.clave=clave;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.claves().contains(clave);
	}

}
