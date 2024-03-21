package tp9Electoral;

import java.util.ArrayList;

public class Mesa{
    private ArrayList<Integer>padron;
    protected ArrayList<Votos>votos;

    public Mesa(){
        this.padron = new ArrayList<>();
        this.votos = new ArrayList<>();
    }
    public ArrayList<Votos> getVotos(){
        ArrayList<Votos> aux = votos;
        return aux;
    }
    public void addVoto(Votos v, int dni){
        for(int i = 0; i<padron.size();i++){
            int voto = padron.get(i);
            if(voto==dni){
             votos.add(v);
            }
        }
    }

    public double cantVotos(Condicion cond) {
        double contador = 0;
        for(int i = 0; i<this.votos.size();i++){
            Votos can = this.votos.get(i);
            if(cond.cumple(can)){
            contador++;
            }
        }
        return (contador/votos.size()*100);
    }
    
    public void addPadron(int dni){
        padron.add(dni);   
     }
    
}
