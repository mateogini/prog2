package parciales;

import java.time.LocalDate;
import java.util.ArrayList;

public class PaqueteCompuesto extends PaqueteGeneral{
    private ArrayList<PaqueteGeneral> paquetes;
    public PaqueteCompuesto(int id, int miembros) {
        super(id, miembros);
        this.paquetes = new ArrayList<>();
    }

    public void addPaquete(PaqueteComun viaje){
        if(this.getMiembros()==viaje.getMiembros() && paquetes.size()>0) {
            int i = paquetes.size();
            if(viaje.getOrigen().equals(paquetes.get(i-1).getDestino())){
                paquetes.add(viaje);
            }
    
        }
        else{ paquetes.add(viaje);
        }
}
    @Override
    public String getDestino() {
        int i = paquetes.size();
        return paquetes.get(i-1).getDestino();
    }

    @Override
    public LocalDate getFechapago() {
        // TODO Auto-generated method stub
        return super.getFechapago();
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }

    @Override
    public int getMiembros() {
        // TODO Auto-generated method stub
        return super.getMiembros();
    }


    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
        super.setId(id);
    }

    @Override
    public void setMiembros(int miembros) {
        // TODO Auto-generated method stub
        super.setMiembros(miembros);
    }

    public ArrayList<PaqueteGeneral> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<PaqueteGeneral> paquetes) {
        this.paquetes = paquetes;
    }

    @Override
    public String getOrigen() {
        int i = 0;
        return paquetes.get(i).getOrigen();
    }

    public ArrayList<PaqueteGeneral> buscar (Filtro ff){
        ArrayList <PaqueteGeneral> aux = new ArrayList<>();
        if(ff.cumple(this)){
            aux.add(this);
        }
        else{
            for(int i = 0; i < paquetes.size(); i++){
                 ArrayList <PaqueteGeneral> result= paquetes.get(i).buscar(ff);
                aux.addAll(result);
            }
        }
        return aux;
    }

    @Override
    public int getPrecio() {
        int precio = 0;
        for(int i=0; i < paquetes.size(); i++){
            precio += paquetes.get(i).getPrecio();
        }
        return precio;
    }

    @Override
    public String getAlojamiento() {
        return paquetes.get(0).getAlojamiento();
    }
  


}
