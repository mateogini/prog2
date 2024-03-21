package tp8List;

public class ContadorDePalabrasPlugin implements Plugin {
	private int contador;
	private String texto;
	
	public ContadorDePalabrasPlugin() {
		setContador(0);
		texto = " ";
	}
	@Override
	public void ejecutar(String texto) {
		 String[] palabras = texto.split("\\s+"); // Dividir por espacios en blanco
	        setContador(palabras.length);
	}
	public int cantidad() {
		return getContador();
	}
	public int getContador() {
		return contador;
	}
	public void setContador(int contador) {
		this.contador = contador;
	}


}
