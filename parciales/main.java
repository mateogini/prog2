package parciales;

import java.util.ArrayList;

public class main {
    public static void main(String[] args){
        Noticia n1 = new Noticia("boca septima", "deportes", "fuchibol fuhcibol", "juan lopez");
        Noticia n2 = new Noticia("boca perdio", "politica", "fuchibol fuhcibol", "juan lopez");
        Noticia n3 = new Noticia("boca", "espectaluco", "fuchibol fuhcibol", "juan lopez");
        Noticia n4 = new Noticia("boca", "musica", "fuchibol fuhcibol", "juan lopez");

        Conjunto seccion = new Conjunto("deportes");
        Conjunto subseccion = new Conjunto("politica");
         Conjunto Grupo = new Conjunto("musica");        
        subseccion.addElemento(n1);
        subseccion.addElemento(n2);
        subseccion.addElemento(n3);
        subseccion.addElemento(n4);
        Grupo.addElemento(seccion);
        seccion.addElemento(subseccion);


        Condicion titulo = new CondicionXTitulo("boca");
        Elemento ruta = Grupo;
        Elemento copia = ruta.getCopia();
        System.out.println(copia.buscarNoticia(titulo));

        n1.addClave("Septima");
        n1.addClave("Penal");

        System.out.println(seccion.getClaves());
        n4.addClaveXCond(titulo, "pipa");
        System.out.println(seccion.getClaves());

        

        


    
    }
}
