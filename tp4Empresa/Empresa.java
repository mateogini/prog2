package tp4Empresa;

public class Empresa {

	public Empresa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Empleado mateo = new Empleado("Mateo", "Gini", 20, 454600217, 1000);
		Empleado juan = new Empleado("Juan", "Carlos", 32, 45445217, 1000);
		
		Persona lucas = new Userfinal("Carlos", "Gonzales", 18, "carlito22", "123456");
		
		Jerarquico jefe = new Jerarquico("Juan", "Rodriguez", 50, 467373, 10000);
		jefe.addEmpleado(mateo);
		//jefe.getEmpleados();
		jefe.addEmpleado(juan);

		System.out.println("Usuarios finales: " + lucas.toString());
		jefe.getEmpleados();
		
		
	}

}
