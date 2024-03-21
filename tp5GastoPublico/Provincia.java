package tp5GastoPublico;
import java.util.ArrayList;



public class Provincia{
	private String name;
	private ArrayList<Ciudad>ciudades;
	
		public Provincia(String name) {
			this.name = name;
			ciudades= new ArrayList<>();
		}
		
		public String getProvincia() {
				return name;
			}
		
	public void addCiudad(Ciudad c) {
		ciudades.add(c);
	}
	public ArrayList<Ciudad> getProv(){
		ArrayList<Ciudad> aux = ciudades;
		return aux;
	}
	
	public void gasto(Provincia p, Impuesto imp) {
		for(int i = 0; i<p.ciudades.size();i++) {
			p.ciudades.get(i).gastoNegativo(imp);
		}
		
	}
	
	public static void main(String[]args) {
		Ciudad tandil = new Ciudad("Tandil",2000000,200);
		Impuesto iva = new Impuesto(20,20,20,20,20);
		Provincia prov = new Provincia("Buenos Aires");
		
		prov.addCiudad( new Ciudad("La Plata", 200, 20));
		prov.addCiudad(tandil);
		
		
		tandil.addImp(iva);
		
			if(tandil.gastoNegativo(iva)) {
				System.out.println("esta ciudad posee gasto negativo");
			}
				else {
					System.out.println("esta ciudad tiene gato positivo");
				}
		
	}
	
}