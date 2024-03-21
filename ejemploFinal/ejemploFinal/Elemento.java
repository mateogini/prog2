package ejemploFinal;

import java.util.ArrayList;

public abstract class Elemento {
    public abstract ArrayList<String> getTitulo();
    public abstract  int cantPaginas();
    public abstract ArrayList<Persona> getRevisor();
    public abstract ArrayList<Persona> getAutor();
    public abstract Elemento copiaElem(Condicion cc);

}
