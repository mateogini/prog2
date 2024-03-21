package tp5GastoPublico;

import java.util.ArrayList;

public class Ciudad {
	private String nombre;
	private int gasto;
	private int habitantes;
	private ArrayList<Impuesto> impuestos;
	
	
	public Ciudad(String nombre, int gasto, int habitantes) {
		this.nombre=nombre;
		this.gasto=gasto;
		this.habitantes=habitantes;
		this.impuestos= new ArrayList<Impuesto>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String n) {
		this.nombre=n;
	}
	public void addImp(Impuesto nuevosImps) {
		impuestos.add(nuevosImps);
	}
	
	
	public ArrayList<Impuesto> getImpuesto() {
		ArrayList<Impuesto> aux = impuestos;
		return aux;
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
	public String toString() {
		return "Nombre: " + nombre + " Gasto:" + gasto + "Habitantes: " + habitantes;
	}
	public boolean gastoNegativo(Impuesto impuesto){
		if(getGasto()> impuesto.getAll()){
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[]args) {
		
	}
	}


