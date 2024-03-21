package Tp9Futbol5;
import java.util.Comparator;


public class ComparadorCompuesto implements Comparator<Socio>{
    private Comparator<Socio> primerCriterio, segundoCriterio;

    public ComparadorCompuesto(Comparator<Socio> primerCriterio, Comparator<Socio> segundoCriterio) {
        this.primerCriterio = primerCriterio;
        this.segundoCriterio = segundoCriterio;
    }

    @Override
    public int compare(Socio o1, Socio o2) {
        int res = primerCriterio.compare(o1, o2);
        if (res!=0)
            return res;
        else return segundoCriterio.compare(o1,o2);
    }

}
