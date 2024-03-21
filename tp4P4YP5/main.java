package tp4P4YP5;

import java.time.LocalDate;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Fresco x2 = new Fresco(LocalDate.of(2023, 12, 9),6700,LocalDate.of(2000, 1, 1), "Los Pibes");
		CongeladoXNitrogeno x3 = new CongeladoXNitrogeno(LocalDate.of(2023, 9, 13), 6500, LocalDate.of(2024, 12, 9), "Granja Hola", 2340, 32.5, "Metodo Chau", 40);
		
		System.out.println(x3.ToString());	
		
		
	}	

}
