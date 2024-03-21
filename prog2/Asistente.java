package prog2;
public class Asistente {
    
    //Atributos
    private String nombreApellido;
    private String email;
    private String telefono;

    //Constructores
    public Asistente (String nombreApellido, String email, String telefono) {
        this.nombreApellido = nombreApellido;
        this.email = email;
        this.telefono = telefono;
    }

    //Getters y Setters
    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //Métodos

}
