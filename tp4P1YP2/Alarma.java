package tp4P1YP2;

public class Alarma {
	private boolean movimiento;
	private boolean abertura;
	private boolean vidrio;
	
	

public void sensorAct(boolean movimiento) {
	this.movimiento=movimiento;
	
}

public void aberturaAct(boolean abertura) {
	this.abertura=abertura;
}

public void vidrioAct(boolean vidrio) {
	this.vidrio=vidrio;
	
}

public boolean comprobar() {
	if((abertura)|| (vidrio) || (movimiento)) {
		return true;
	}
	else {
		return false;
	}
}



public static void main (String[]args) {
	alarmaLuminosa alarmaluminosa = new alarmaLuminosa();
	Timbre timbre = new Timbre();
	Alarma alarma1 = new Alarma();
	alarma1.vidrioAct(false);
	// alerta sonora y luz
	 if(alarmaluminosa.alertar(alarma1.comprobar())) {
		System.out.println("Se encendio la alarma");
	}
	else {
		System.out.println("La alarma no se encuentra activa");
	}
	// alerta sonora
	if(timbre.hacerSonar(alarma1.comprobar())) {
		System.out.println("alerta sonora activa");
	} 
	 else {
		 System.out.println("alerta sonora apagada");	
	 }
	 
}
	
}
