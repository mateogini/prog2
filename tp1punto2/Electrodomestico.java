package tp1punto2;

public class Electrodomestico {
	private String nombre;
	private int precio_base;
	private int consumo;
	private int peso;




//constructor
public Electrodomestico(String nombre){
	this(nombre,100,10,2);
}
public Electrodomestico(String nombre, int precio_base, int consumo, int peso) {
	this.nombre=nombre;
	this.precio_base=precio_base;
	this.consumo=consumo;
	this.peso=peso;
}

//metodos

public boolean bajoConsumo() {
	if(consumo>45){
		return false;
	}
	else 
		return true;
	}

public int balance() {
	return precio_base/peso;
}
public boolean altaGama() {
	if(balance()>3) {
		return true;
	}
	else {
		return false;
	}
}
}





