package parcialejemplo;
import java.util.ArrayList;

public class ComboPromocional extends Combo{
    public ComboPromocional(Condicion condiciones) {
        super(condiciones);
    }

    public double getPrecio(){
        int contador = 0;
        int precio = 0;
        for(Producto pp:combos){
            precio += pp.getPrecio();
            contador++;
        }
    return precio/contador;
    }
    
}
