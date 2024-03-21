package parcialejemplo;

import java.util.ArrayList;

public abstract class Grupo {
    public abstract int cantidadQue(Filtro ff);
    public abstract int esVoluntario();
    public abstract ArrayList<Voluntario> quienesQue(Filtro ff);
    
}
