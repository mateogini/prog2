package parcialejemplo;

import java.util.ArrayList;

public abstract class Producto {
    public abstract double getPrecio();
    public abstract double getPeso();
    public abstract ArrayList<String> getCategorias();
    public abstract int cantProd();
    public abstract Suelto menorPeso();
    public abstract Producto copiaRestringida(Condicion cc);
    public abstract ArrayList<Producto> buscar(Condicion cc);


}
