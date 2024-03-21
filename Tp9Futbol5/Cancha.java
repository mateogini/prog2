package Tp9Futbol5;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Collections;

public class Cancha {
	private ArrayList<Socio>socios;
	public Cancha() {
		this.socios = new ArrayList<>();

	}
	public ArrayList<Socio> buscar(Condicion c){
		ArrayList<Socio> aux = new ArrayList<>();
		for(int i = 0; i<socios.size();i++){
			Socio s = socios.get(i);
			if(c.cumple(s)){
				aux.add(s);
			}
		}
		return aux;
		
	}
	public void addSocio(Socio s) {
		socios.add(s);
	}
	public Socio getSocio(Socio a) {
		for(Socio soc:socios) {
			if(soc.equals(a)) {
				return soc;
			}
		}
		return null;
	}
	public static void main (String args[]) {
		Cancha cancha = new Cancha();
		Socio socio1 = new Socio("Z","A", 15, false);
		Socio socio2 = new Socio("B","A", 17, false);
		Socio socio3 = new Socio("C","C", 30, true);
		Socio socio4 = new Socio("D","D", 22, false);
		Socio socio5 = new Socio("E","E", 29, false);
		Socio socio6 = new Socio("F","F", 28, false);


		Alquiler alquiler = new Alquiler(LocalDate.of(2023, 10, 29), 14, 8500.2);
		Alquiler alquiler2 = new Alquiler(LocalDate.of(2023, 10, 29), 14, 8500.2);
		Alquiler alquiler3 = new Alquiler(LocalDate.of(2023, 10, 29), 2, 8500.2);

		
		cancha.addSocio(socio1);
		cancha.addSocio(socio2);
		cancha.addSocio(socio3);
		cancha.addSocio(socio4);
		cancha.addSocio(socio5);
		cancha.addSocio(socio6);



		socio2.addAlquiler(alquiler);
		socio3.addAlquiler(alquiler2);
		socio4.addAlquiler(alquiler3);

	

		CondicionCuota cuotaImpaga = new CondicionCuota(false);
		ArrayList<Socio> sociosImpagos = cancha.buscar(cuotaImpaga);
		System.out.println("Socios sin pagar ordenados por apellido y si no, por nombre");
		Collections.sort(sociosImpagos, new ComparadorCompuesto(new ComparadorApellido(), new ComparadorNombre()));
		System.out.println(sociosImpagos);
		
		System.out.println("\n");
		
		System.out.println("menores de edad ordenados por edad");
		Condicion mayor = new CondicionEdad(18);
		ArrayList<Socio> sociosMenores = cancha.buscar(mayor);
		Collections.sort(sociosMenores, new ComparadorEdad().reversed());
		System.out.println(sociosMenores);
		
		System.out.println("\n");

		System.out.println("Alquilo cancha 14");
		Condicion alquilo = new CondicionAlquiler(14);
		ArrayList<Socio> alquiloCanch = cancha.buscar(alquilo);
		Collections.sort(alquiloCanch);
		System.out.println(alquiloCanch);

		System.out.println("\n");

		System.out.println("Todos los socios que pagaron más de $500 por algún alquiler de cancha, listando primero los que tienen las cuotas pagas, ordenados alfabéticamente y luego los morosos, también ordenados alfabéticamente.");
		Condicion pago500 = new CondicionPrecio(500);
		ArrayList<Socio> pago = cancha.buscar(pago500);
		Collections.sort(pago, new ComparadorCompuesto(new ComparadorPago(), new ComparadorCompuesto(new ComparadorApellido(), new ComparadorNombre())));

		System.out.println(pago);

	}
	
}
