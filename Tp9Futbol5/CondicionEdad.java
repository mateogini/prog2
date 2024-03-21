package Tp9Futbol5;

public class CondicionEdad implements Condicion<Socio> {
    private int edad;

    public CondicionEdad(int edad){
        this.edad=edad;
    }
    public boolean cumple(Socio s){
        return s.getEdad()<this.edad;
    }
}
