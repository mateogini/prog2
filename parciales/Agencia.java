package parciales;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Agencia {
    private ArrayList<PaqueteGeneral>viajes;

    public Agencia(){
        this.viajes = new ArrayList<>();
    }

    public void addViaje(PaqueteGeneral p){
        viajes.add(p);
    }
    public static void main (String args[]){
        PaqueteComun tandil = new PaqueteComun("casa", "tandil", "brasil", 2000, 23, 5);
        PaqueteCompuesto superviaje = new PaqueteCompuesto(24, 5);
        PaqueteComun ayacucho = new PaqueteComun("cabaña", "ayacucho", "tandil", 20000, 25, 5);
        PaqueteComun brasil = new PaqueteComun("cabaña", "brasil", "ayacucho", 10000, 26, 5);
        superviaje.addPaquete(tandil);
        System.out.println(superviaje.getDestino());
        superviaje.addPaquete(ayacucho);
        System.out.println(superviaje.getOrigen()); 
        superviaje.addPaquete(brasil);

        ArrayList aux = superviaje.buscar(new FiltroXDestino("cabaña"));
        Collections.sort(aux, new ComparadorPorPrecio().reversed());
        System.out.println(aux);
        
        


    }
}
