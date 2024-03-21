package parcialejemplo;

public class CondicionXPrecio implements Condicion {
    private double precio;


    public CondicionXPrecio(double precio){
        this.precio = precio;
    }

    public boolean cumple(Producto pp){
        return pp.getPrecio()<this.precio;
    }
}
