package Tp9Futbol5;

public class CondicionCuota implements Condicion<Socio> {
    private boolean pago;

    public CondicionCuota(boolean pago){
        this.pago = pago;
    }

    public boolean cumple(Socio s){
        return s.isCuotaPaga()==pago;
    
    }
}
