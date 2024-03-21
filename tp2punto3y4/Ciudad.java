package tp2punto3y4;
import java.util.ArrayList;

public class Ciudad {
	private int gasto;
	private int habitantes;
	private ArrayList<Impuesto> impuestos;
	private ArrayList<Provincia> provincias;
	
	
	public Ciudad( int gasto, int habitantes) {
		this.gasto=gasto;
		this.habitantes=habitantes;
		this.impuestos= new ArrayList<Impuesto>();
		this.provincias= new ArrayList<Provincia>();
	}
	public ArrayList<Provincia>getProvincias(){
		return provincias;
	}
	public void addImp(Impuesto nuevosImps) {
		impuestos.add(nuevosImps);
	}
	public void addProv(Provincia nuevaProv) {
		this.provincias.add(nuevaProv);
	}
	
	public ArrayList<Impuesto> getImpuesto() {
		return impuestos;
	}
	public int getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(int habitantes) {
		this.habitantes=habitantes;
	}


	public int getGasto() {
		return gasto;
	}


	public void setGasto(int gasto) {
		this.gasto = gasto;
	}
	public static boolean gastoNegativo(Ciudad ciudad, Impuesto impuesto){
		if(ciudad.getGasto()> impuesto.getAll()){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[]args) {
		Ciudad tandil = new Ciudad(20,200000);
		Impuesto iva = new Impuesto(20,20,20,20,20);
		Provincia bsas = new Provincia("bsas");
		tandil.addProv(bsas);
		tandil.addImp(iva);
		
			if(gastoNegativo(tandil, iva)) {
				System.out.println("esta ciudad posee gasto negativo");
			}
				else {
					System.out.println("esta ciudad tiene gato positivo");
				}
	}
	}

