package tp7Documentos;

public class menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Digitalizacion casa = new Digitalizacion();
		Documento doc1 = new Documento("Holmes", "ASASASAASAS");
		doc1.addAutor("Borges");
		doc1.addClave("AS");
		
		casa.addDocu(doc1);
		
		Condicion titulo = new CondicionXTitulo("Holme");
		System.out.println(casa.buscar(titulo));
		
		Condicion clave = new CondicionXNoClave("has");
		System.out.println(casa.buscar(clave));
		
		//g) Todos los documentos cuyo contenido tenga al menos 20 palabras.
		
	}
	

}
