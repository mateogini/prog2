package parcialejemplo;

import java.util.Comparator;

public class ComparadorXNombre implements Comparator<Suelto>{
    
    public int compare(Suelto s1, Suelto s2){
        return (int) (s1.getPeso() - (s2.getPeso()));
    
    }
}
