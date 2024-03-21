package tp9SitioNoticias;

import java.util.ArrayList;

public abstract class Componente {
    public abstract int cantNoticias();
    public abstract ArrayList<Componente>buscar(Condicion c);  
    public abstract Componente copiaRestringida(Condicion c);  
    public abstract ArrayList<String> getPalabrasClaves();
}
