package parcialejemplo;

import java.util.ArrayList;

public class Voluntario extends Grupo{
    private String nombre;
    private String nacionalidad;
    private int edad;
    private String genero;
    private ArrayList<String> enfermedades;
    private boolean contrajoEnf;
    private boolean placebo;
    private boolean vacuna;

    

    public Voluntario(String nombre, String nacionalidad, int edad, String genero, boolean contrajoEnf, boolean placebo,
            boolean vacuna) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.genero = genero;
        this.contrajoEnf = contrajoEnf;
        this.placebo = placebo;
        this.vacuna = vacuna;
        this.enfermedades = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isContrajoEnf() {
        return contrajoEnf;
    }
    public void setContrajoEnf(boolean contrajoEnf) {
        this.contrajoEnf = contrajoEnf;
    }
    public boolean isPlacebo() {
        return placebo;
    }
    public void setPlacebo(boolean placebo) {
        this.placebo = placebo;
    }
    public boolean isVacuna() {
        return vacuna;
    }
    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int cantidadQue(Filtro ff){
        if(ff.cumple(this)){
            return 1;
        }
        else
            return 0;
    }

    public int esVoluntario(){
        return 1;
    }
    public ArrayList<Voluntario> quienesQue(Filtro ff){
        ArrayList<Voluntario> aux = new ArrayList<>();
        if(ff.cumple(this)){
            aux.add(this);
        }
        return aux;
    }
    
   
    
}
