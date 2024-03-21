package tp8List;

public  class Menu {
	public  void ejecutarPlugin(Plugin plugin, String texto) {
		plugin.ejecutar(texto);
	}
	
	public static void main(String args[]) {
		Menu proc = new Menu();
		ContadorDePalabrasPlugin cantPal = new ContadorDePalabrasPlugin();
		ContadorDeOcurrencias cantOcu = new ContadorDeOcurrencias("hola");
		proc.ejecutarPlugin(cantPal, "Hola, hola chau");
		System.out.println(cantPal.cantidad());
		
		cantOcu.ejecutar("Holaa, como hola , hola.");
		System.out.println(cantOcu.cantidad());
		
		

		
		
	}
}
