package parciales;

import java.util.Comparator;

public class ComparadorXTitulo implements Comparator<Noticia>{

    @Override
    public int compare(Noticia o1, Noticia o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
    
}
