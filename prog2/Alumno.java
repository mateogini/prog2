package prog2;

public class Alumno {
    private static int cantidadAlumnos;
    private String nombre;
    private int legajo;

    public Alumno(String nombre) {
        this.nombre = nombre;
        legajo = cantidadAlumnos;
        cantidadAlumnos++;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    public static void setCant(int valor) {
    	cantidadAlumnos=valor;
    }


public static void main(String[] args) {
    Alumno a1 = new Alumno("Marcelo");
    Alumno a2 = new Alumno("Luis");
    Alumno a3 = new Alumno("Ariel");
    Alumno.cantidadAlumnos=0;
    System.out.println(a3.getLegajo());
}
}

