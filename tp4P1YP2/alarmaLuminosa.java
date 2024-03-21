package tp4P1YP2;

public class alarmaLuminosa extends Alarma {
	public alarmaLuminosa() {

	}
	public boolean alertar(boolean encendida) {
		 Timbre sonido = new Timbre();
	     Luz luz = new Luz();
		if(encendida) {
		luz.encender(encendida);
		sonido.hacerSonar(encendida);
		return encendida;
		}
		else {
			return false;
		}
		
	}

}
