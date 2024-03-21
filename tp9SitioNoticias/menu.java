package tp9SitioNoticias;

import java.util.ArrayList;

public class menu {
        
    public static void main(String args[]){
    Categoria Politica = new Categoria ("Politica", "Imagen de urna");
    Categoria Milei = new Categoria ("Politica", "Imagen de urna");

    Categoria Deportes = new Categoria ("Deportes", "Imagen de pelota");

    Categoria Argentina = new Categoria ("Argentina", "Imagen de urna");



    Noticia n1 = new Noticia("Votacion Milei", "gano milei", "hh","www.ecotv.com", "sasfasfafasfa");
    Noticia n2 = new Noticia("Boca campeon libertadores", "gano boca", "Juan Lopez","www.ecotv.com", "sasfasfafasfa");
    Noticia n3 = new Noticia("Boca perdio la libertadores", "perdio boca", "Juan Lopez","www.ecotv.com", "sasfasfafasfa");


    Deportes.addComp(n3);
    Deportes.addComp(n2);
    Politica.addComp(Milei);
    Argentina.addComp(Politica);
    Argentina.addComp(Deportes);
        //Trae cantidad de noticias;
    System.out.println(Argentina.cantNoticias());

    n1.addClave("politica");
    n2.addClave("aubol");
    n2.addClave("bolitica");

    

    Condicion autor = new CondicionXNombre("Juan Lopez");
    System.out.println(Argentina.copiaRestringida(autor));
   

    System.out.println(Deportes.getPalabrasClaves());

    }
}
