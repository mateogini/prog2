package parcialejemplo;

import java.util.ArrayList;

public class Zona  extends Grupo{
    private ArrayList<Grupo> elementos;
    

    public Zona(){
        this.elementos = new ArrayList<>();
    }

    public void addElem(Grupo gg){
        elementos.add(gg);
    }

    public int cantidadQue(Filtro ff){
        int cant = 0;
        for(Grupo gg:elementos){
            cant+= gg.cantidadQue(ff);
        }
        return cant;
    }

    public int esVoluntario(){
        int cant=0;
        for(Grupo gg:elementos){
            cant+=gg.esVoluntario();
        }
    return (cant);
    }
    public  int procentajeQue(Filtro ff){
        return (esVoluntario()/cantidadQue(ff));
    }

    public ArrayList<Voluntario> quienesQue(Filtro ff){
        ArrayList<Voluntario> aux = new ArrayList<>();
        for(Grupo gg:elementos){
            aux.addAll(gg.quienesQue(ff));
        }
        return aux;
    }
}
