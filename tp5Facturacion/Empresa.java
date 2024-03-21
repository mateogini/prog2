package tp5Facturacion;

public abstract class Empresa {

	public Empresa() {
		// TODO Auto-generated constructor stub
	}
	public abstract double sueldoTotal();
	
	public static void main(String[]args) {
		Empleado mateo= new Empleado("Mateo", "Gini", 45460217, 20000);
		ExtraXVenta mateo2 = new ExtraXVenta("Mateo", "Gini", 45460217, 20000); 
		
		double sueldo = mateo2.sueldoTotal(0.05,1000);
		System.out.println("El sueldo total de: " + mateo2.getNombre() +  " es: " + sueldo);
		
		ExtraXBonos bono = new ExtraXBonos("Juan", "Lopez", 45460217, 20000, 20);
		
		double sueldo2 = bono.sueldoTotal(2000,19);
		
		System.out.println("el sueldo total por bonos es: " + sueldo2);
		
		
	}
}
