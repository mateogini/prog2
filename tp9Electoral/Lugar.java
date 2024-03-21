package tp9Electoral;

import java.util.ArrayList;

public class Lugar implements Fiscal{
    private String nombre;
    private ArrayList<Lugar>barrios;
    private Lugar contenedor;
    private ArrayList<Mesa>mesas;

    public Lugar(String nombre){
        this.nombre= nombre;
        this.barrios = new ArrayList<>();
        this.mesas = new ArrayList<>();
    }
    public ArrayList<Mesa> getMesas(){
        ArrayList<Mesa> aux = mesas;
        return aux;
    }
    public void addMesa(Mesa m){
        mesas.add(m);
    }
    public void addLugar(Lugar l){
        if(contenedor==null){
            barrios.add(l);
            l.contenedor = this;
        }
        
    }
    

    public Lugar getContenedor() {
        return contenedor;
    }
    public void setContenedor(Lugar contenedor) {
        this.contenedor = contenedor;
    }
    public double cantVotos(Condicion cond) {
         double contador = 0;
         double votos = 0;
         int votantes = 0;
         if(this.barrios.isEmpty()) {
                for(int j= 0;j<mesas.size();j++){
                    Mesa m = mesas.get(j);
                    votos+=m.cantVotos(cond);
                }
                return votos;
             }
        else{
            for(int h= 0; h<barrios.size();h++){
                Lugar barrio = barrios.get(h);
                votos+=barrio.cantVotos(cond);         
                votantes+=barrios.size();
            }
            return votos/votantes;
        }
        
    }
    public String toString(){
    return " " + nombre;
    }
   
   
}
