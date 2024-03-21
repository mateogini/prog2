package parciales;

import java.util.Comparator;

public class ComparadorPorPrecio implements Comparator<PaqueteGeneral>{
    
    public int compare(PaqueteGeneral p1, PaqueteGeneral p2){
        return p1.getPrecio() - (p2.getPrecio());
    }
}
