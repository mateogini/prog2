package tp2punto2;

public class Temporada {
	private String nombre;
	private Episodio[] episodios;

public Temporada(String nombre, int cantEpisodios) {
	this.nombre=nombre;
	this.episodios= new Episodio[cantEpisodios];
}
public void agregarEpisodio(int indice, Episodio episodio) {
	episodios[indice]=episodio;
}
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getCantidadEpisodiosVistos() {
    int cantidadVistos = 0;
    for (Episodio episodio : episodios) {
        if (episodio != null && episodio.isVista()) {
            cantidadVistos++;
        }
    }
    return cantidadVistos;
}


public static void main (String[]args) {
	Episodio episodio1 = new Episodio("n","n",5,true);
	Episodio episodio2 = new Episodio("n","n",-2,false);
	Episodio episodio3 = new Episodio("n","n",2,true);

	Temporada temporada1 = new Temporada("dos",3);
	temporada1.agregarEpisodio(0,episodio1);
	temporada1.agregarEpisodio(1,episodio2);
	temporada1.agregarEpisodio(2,episodio3);

	
    System.out.println("Cantidad de episodios vistos: " + temporada1.getCantidadEpisodiosVistos());
}

	
}
	
	
	

