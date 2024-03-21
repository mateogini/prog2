package tp6PuertoCereales;


public class Barco extends Transporte {
		private int capacidad;
		private String patente;
		
		public Barco(int capacidad, String patente) {
			this.capacidad=capacidad;
			this.patente=patente;
		}

		public int getCapacidad() {
			return capacidad;
		}

		public void setCapacidad(int capacidad) {
			this.capacidad = capacidad;
		}

		public String getPatente() {
			return patente;
		}

		public void setPatente(String patente) {
			this.patente = patente;
		}
		
		
		
}
