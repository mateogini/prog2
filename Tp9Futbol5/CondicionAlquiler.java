package Tp9Futbol5;

public class CondicionAlquiler implements Condicion<Socio>{
    private int cancha;

    public CondicionAlquiler(int cancha){
        this.cancha= cancha;
    }
    public boolean cumple(Socio s){
        int i = 0;
        while(i<s.alquileres.size()){
            if(s.alquileres.get(i).getIdCancha()==cancha){
                i=s.alquileres.size();
                return true;
            }
            i++;
        }
    return false;
    }

}

