package parcialejemplo;

public class CondicionXPeso implements Condicion{
    private double peso;


    public CondicionXPeso(double peso){
        this.peso = peso;
    }

    public boolean cumple(Producto pp){
        return pp.getPeso()>this.peso;
    }
}
