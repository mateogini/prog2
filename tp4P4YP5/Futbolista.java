package tp4P4YP5;

import java.time.LocalDate;

public class Futbolista extends Integrante {
	private String pos;
	private String pierna;
	private int goles;
	public Futbolista(String nombre, String apellido, int pasaporte, LocalDate fechanac,boolean concentra, boolean paisdeorigen) {
		super(nombre, apellido, pasaporte, fechanac, concentra, paisdeorigen);
	}
	public boolean dispo() {
		if(super.isConcentra()&& super.isPaisdeorigen()) {
		return true;
		}
		else {
			return false;
		}
	}

}
