package parciales;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PaqueteGeneral {
    private int id,miembros;
    public PaqueteGeneral(int id, int miembros) {
        this.id = id;
        this.miembros = miembros;
    }
    public  int getId(){
        return id;
    }
    public  void setId(int id){
        this.id=id;
    };
    public int getMiembros(){
        return miembros;
    };
    public  void setMiembros(int miembros){
        this.miembros = miembros;
    };
    public abstract String getDestino();
    public abstract String getOrigen();
    public abstract int getPrecio();
    public LocalDate getFechapago() {
        return null;
    }
    public  ArrayList<PaqueteGeneral> buscar(Filtro ff){
        ArrayList<PaqueteGeneral> aux = this.buscar(ff);
        return aux;
    };

    public String toString(){
    return "id " + getId();
    }
    public abstract String getAlojamiento();
    
}
