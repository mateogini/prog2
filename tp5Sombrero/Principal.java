package tp5Sombrero;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Alumno a1 = new Alumno("Juan", false);
		Alumno a3 = new Alumno ("Mateo", false);
		Alumno a4 = new Alumno ("Jose", false);
		
		a1.addCualidad("malo");
		a3.addCualidad("malo");
		a4.addCualidad("bueno");
		a1.addFamiliar(a3);
		//a1.addFamiliar(a4);
		
		Casa howarts = new Casa();
		howarts.addCualidad("malo");
		
		
		howarts.setCupo(3);
		howarts.addAlumno(a3);
		
		
		
		
		howarts.addAlumnoXFamilia(a1);
		
		howarts.addAlumno(a4);		
		System.out.println(a1.isAsignado());
		
		System.out.println(a3.isAsignado());
	
		System.out.println(a4.isAsignado());

	}
}
