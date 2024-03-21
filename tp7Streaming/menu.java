package tp7Streaming;

public class menu {

	public static void main(String[] args) {
		Plataforma netflix = new Plataforma();
		Pelicula pelicula2 = new Pelicula("Avengers luna nueva"," muchos heroes asasas", "Mateo Gini", 2023, 90, 10);
		Pelicula pelicula3 = new Pelicula("Simpsons y la luna","sprinfield aaaa", "Martin Scorsese", 2004, 90, 6);
		Pelicula pelicula4 = new Pelicula("Rapido y Furiosos","carreras de autos", "Adrian Suar", 2013, 120, 16);
		Pelicula pelicula5 = new Pelicula("Mision Imposible","salvar a su hija", "Juan Gomez", 2018, 150, 18);
		
		pelicula2.setActores("Will Smith");
		pelicula2.setActores("Adam Slander");
		pelicula3.setActores("Paul Walker");
		pelicula3.setActores("Juan Gomez");
		pelicula4.setActores("Lucas Fernandez");
		pelicula4.setActores("Will Smith");
		
		pelicula2.setGenero("Comedia");
		pelicula2.setGenero("Terror");
		pelicula3.setGenero("Infantil");
		pelicula3.setGenero("Drama");
		pelicula4.setGenero("Accion");
		pelicula5.setGenero("Documental");
		
		netflix.addPel(pelicula2);
		netflix.addPel(pelicula3);
		netflix.addPel(pelicula4);
		netflix.addPel(pelicula5);
		
		Condicion titulo = new CondXTitulo("luna");
		Condicion genero = new CondXGenero("Infantil");
		Condicion genero2 = new CondXGenero("Documental");

		Condicion anio = new CondXAnio(2017);
		Condicion actor = new CondXActor("Will Smith");
		Condicion director = new CondXDir("Martin Scorsese");
		Condicion duracion = new CondXMin(95);
		
		Condicion direyact = new CondXOR(actor,director);
		Condicion and = new CondAnd(genero,genero2);
		
		
		
		
		System.out.println("Peliculas con 'luna' en su titulo");
		System.out.println(netflix.buscar(titulo));
		
		System.out.println("Peliculas con genero terror");
		System.out.println(netflix.buscar(genero));
		
		System.out.println("las películas en las que haya actuado Will Smith y cuyo directo NO haya sido Martin Scorsese");
		System.out.println(netflix.buscar(direyact));
		
		System.out.println("Peliculas antes de 2015 y duracion menor a 95 min");
		System.out.println(netflix.buscar(and));
		
		System.out.println("Peliculas antes de 2015 y duracion menor a 95 min");
		System.out.println(netflix.buscar(and));
		
		
		System.out.println("Peliculas despues del 2017 y genero infantil o documental");
		System.out.println(netflix.buscarY(and, anio));
		


		



		

		
	}

}
