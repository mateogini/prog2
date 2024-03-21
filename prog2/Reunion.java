package prog2;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reunion {

    //Atributos
    private LocalDate fechaReunion;
    private LocalTime inicioReunion;
    private Duration duracion;
    private String ubicacion;
    private ArrayList<Asistente> asistentes;    
    

    //Constructores
    public Reunion(LocalDate fechaReunion, Duration duracion, String ubicacion) {
        this.fechaReunion = fechaReunion;
        this.duracion = duracion;
        this.ubicacion = ubicacion;
        this.asistentes = new ArrayList<Asistente>();
    }

 
    //Getters y Setters   
    public void setFechaReunion(LocalDate fechaReunion) {
        this.fechaReunion = fechaReunion;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Asistente> getAsistentes() {
        return asistentes;
    }


    //Métodos 
    public void addAsistente(Asistente nuevoAsistente) throws Exception {
        if(!asistentes.contains(nuevoAsistente)) {
            this.asistentes.add(nuevoAsistente);
        } else {
            throw new Exception("ERROR: La persona que intenta agregar ya es un asistente de esta reunión.");
        }
    }

    public void removeAsistente(Asistente unAsistente) {
        if(asistentes.contains(unAsistente)) {
            this.asistentes.remove(unAsistente);
        }
        else {
            throw new Error("ERROR: La persona que intenta remover del listado de asistentes, no pertenece a esta reunión.");            
        }
    }

    public LocalDateTime getInicioReunion() {
        return LocalDateTime.of(fechaReunion, inicioReunion);
    }

    public LocalDateTime getFinReunion() {
        return LocalDateTime.from(getInicioReunion().plus(duracion));
    }
}
