package tp8List;

public class ContadorDeOcurrencias implements Plugin{
	private int contador;
	private String palabraBus;
	public ContadorDeOcurrencias(String palabraBus) {
		this.contador = 0;
		this.palabraBus = palabraBus;
		
	}

	@Override
	public void ejecutar(String texto) {
		 String[] palabras = texto.split("\\s+");
	        for (String palabra : palabras) {
	            if (palabra.equalsIgnoreCase(palabraBus)) {
	                contador++;
	            }
	        }
	}
	public int cantidad() {
		return this.contador;
	}

}
