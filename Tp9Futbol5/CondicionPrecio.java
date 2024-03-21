package Tp9Futbol5;

public class CondicionPrecio implements Condicion<Socio>{
    private int pago;

    public CondicionPrecio(int pago){
        this.pago = pago;
    }

    @Override
    public boolean cumple(Socio s) {
        for(int i= 0; i < s.alquileres.size();i++){
            Alquiler a = s.alquileres.get(i);
            if(a.isPago()>pago){
            return true;
            }
        }
        return false;
    }
    
}
