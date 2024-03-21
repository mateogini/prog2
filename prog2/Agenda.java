package prog2;
import java.util.ArrayList;

public class Agenda {

    //Atributos
    private ArrayList<Reunion> reuniones;


    //Constructores
    public Agenda() {
        this.reuniones = new ArrayList<Reunion>();
    }


    //Getters y Setters
    public ArrayList<Reunion> getReuniones() {
        return reuniones;
    }


    //Métodos
    public void addReunion(Reunion nuevaReunion) throws Exception {
        if (reuniones.contains(nuevaReunion)) {
            throw new Exception("La reunión que intenta agregar ya se encuentra registrada.");
        }
        
        for (Reunion r : reuniones) {
            if ((nuevaReunion.getInicioReunion().isAfter(r.getInicioReunion())) && (nuevaReunion.getInicioReunion().isBefore(r.getFinReunion()))) {
                throw new Exception("La reunión que quiere programar entra en conflicto con otra reunión agendada previamente.");
            }
        }
        reuniones.add(nuevaReunion);
    }

    public void removeReunion(Reunion unaReunion) {
        if (reuniones.contains(unaReunion)) {
            reuniones.remove(unaReunion);
        }
    }
    public static void main(String[]args) {
    }
}
