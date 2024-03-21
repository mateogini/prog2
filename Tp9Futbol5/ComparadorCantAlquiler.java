package Tp9Futbol5;

import java.util.Comparator;

public class ComparadorCantAlquiler implements Comparator<Socio> {
   

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.cantAlquileres()-o2.cantAlquileres();
    }
}

