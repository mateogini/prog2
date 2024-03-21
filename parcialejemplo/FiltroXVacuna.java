package parcialejemplo;

public class FiltroXVacuna implements Filtro{
    private boolean vacuna;

    public FiltroXVacuna(boolean vacuna){
        this.vacuna = vacuna;
    }

    public boolean cumple(Voluntario vv){
        return this.vacuna == vv.isVacuna();
    }
}
