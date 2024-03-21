package Tp9Futbol5;

import java.util.ArrayList;
import java.util.Comparator;


public class ComparadorPago implements Comparator<Socio>{

    @Override
    public int compare(Socio o1, Socio o2) {
            if (o1.isCuotaPaga() && !o2.isCuotaPaga()){
                return -1;
            }
            else if (!o1.isCuotaPaga()&&o2.isCuotaPaga()){
                return 1;
            }
            else {
                return 0;
            }
        }


    
    
}
