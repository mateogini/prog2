package tp2punto2;

public class Serie {
private String titulo;
private String genero;
private String creador;
private String descripcion;
private Temporada[] temporadas;

public Serie(String titulo,String genero, String creador,String descripcion,int cantTemporadas) {
	this.titulo=titulo;
	this.genero=genero;
	this.creador=creador;
	this.descripcion=descripcion;
	this.temporadas= new Temporada[cantTemporadas];
}
public void agregarTemps(int indice, Temporada temporada) {
	temporadas[indice]=temporada;
}

public Serie(String titulo, int cantTemporadas){
	this.titulo=titulo;
	this.temporadas= new Temporada[cantTemporadas];

}
public static void main (String[]args) {
	Temporada temporada1 = new Temporada("dos",3);
	Temporada temporada2 = new Temporada("dos",2);
	Temporada temporada3 = new Temporada("dos",3);


	Serie serie= new Serie("n","n","n","n",3);
	serie.agregarTemps(0, temporada1);
	serie.agregarTemps(1, temporada2);
	serie.agregarTemps(2, temporada3);

	int episodiosVistosTemporada1 = temporada1.getCantidadEpisodiosVistos();
    System.out.println("Episodios vistos en temporada 1: " + episodiosVistosTemporada1);

}
}
