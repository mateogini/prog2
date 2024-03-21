package parciales;

public class FiltroXDestino implements Filtro{
    private String destino;

    public FiltroXDestino(String destino){
        this.destino = destino;
    }

    public boolean cumple(PaqueteGeneral pp){
        return pp.getAlojamiento().equals(destino);
    }
}
