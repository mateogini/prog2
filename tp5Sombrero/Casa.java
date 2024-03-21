package tp5Sombrero;
import java.util.ArrayList;

public class Casa {
	private int cupo;
	private ArrayList <Alumno>alumnos;
	private ArrayList<String> cualidades;
	public Casa() {
		cualidades= new ArrayList<>();
		alumnos= new ArrayList<>();
	
	}
	public int getCupo() {
		return cupo;
	}
	public void setCupo(int cupo) {
		this.cupo = cupo;
	}
	public void addCualidad(String cualidad) {
		cualidades.add(cualidad);
	}
	
	public ArrayList<String> getCualidad() {
		ArrayList aux = new ArrayList<>();
		aux=cualidades;
		return aux;
	}
	
	public void addAlumnoXFamilia(Alumno a) {
		if(!a.isAsignado() && a.getCualidad().containsAll(cualidades) && alumnos.size()<getCupo()&&a.getFamilia().containsAll(alumnos)){
			alumnos.add(a);
			a.setAsignado(true);
		}
	}
	public void addAlumno(Alumno a) {
		if(!a.isAsignado() && a.getCualidad().containsAll(cualidades) && alumnos.size()<getCupo()){
			alumnos.add(a);
			a.setAsignado(true);
		}
	}
	public ArrayList<Alumno> getAlumnos() {
		ArrayList<Alumno> aux = new ArrayList<>();
		aux=alumnos;
		return aux;
	}
	
	

}
