package parciales;

import java.time.LocalDate;
import java.util.ArrayList;

public class PaqueteComun extends PaqueteGeneral{
    private String alojamiento, destino, origen;
    private int precio;
    public PaqueteComun(String alojamiento, String destino, String origen, int precio, int id, int miembros) {
        super(id, miembros);
        this.alojamiento = alojamiento;
        this.destino = destino; 
        this.origen = origen;
        this.precio = precio;
        //TODO Auto-generated constructor stub
    }
    public String getAlojamiento() {
        return alojamiento;
    }

    @Override
    public String getDestino() {
        // TODO Auto-generated method stub
        return destino;
    }

    @Override
    public LocalDate getFechapago() {
        // TODO Auto-generated method stub
        return super.getFechapago();
    }

    @Override
    public int getId() {
       return super.getId();
       }
    @Override
    public void setId(int id) {
        super.setId(id);
    }
    @Override
    public int getMiembros() {
        return super.getMiembros();
    }
    @Override
    public void setMiembros(int miembros) {
        super.setMiembros(miembros);
    }
    public void setAlojamiento(String alojamiento) {
        this.alojamiento = alojamiento;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
 
    public ArrayList<PaqueteGeneral> buscar(Filtro ff){
        ArrayList <PaqueteGeneral> aux = new ArrayList<>();
        if(ff.cumple(this)){
            aux.add(this);
        }
        return aux;
    }
    
}
