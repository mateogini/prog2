package tp6Alquiler;

import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;



public class SistemaDeAlquiler {

	private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Alquiler> items = new ArrayList<>();
    private ArrayList<Videoclub> alquileres = new ArrayList<>();

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarItemAlquilable(Alquiler item) {
        items.add(item);
    }

    public void realizarAlquiler(Cliente cliente, Alquiler item, LocalDate fechaInicio, LocalDate fechaDevolucion) {
        if (cliente != null && item != null && item.disponible()) {
            Videoclub alquiler = new Videoclub(cliente, item, fechaInicio, fechaDevolucion);
            alquileres.add(alquiler);
            item.cantidad();
            // Reducir la cantidad de copias disponibles para películas, si es una película
            // Realizar otras acciones específicas según el tipo de ítem alquilable
        }
    }
    
    public static void main(String[]args) {
    	
    	Cliente juan = new Cliente("Juan");
    	Pelicula pel = new Pelicula ("terminator", "asasas", 2);
    	Vehiculo auto = new Vehiculo ("Fiat",280000, "CGZ 919","nafta", false);
    	
    	SistemaDeAlquiler videoclub = new SistemaDeAlquiler();
    	
    	videoclub.agregarCliente(juan);
    	
    	videoclub.agregarItemAlquilable(pel);
    	
    	videoclub.realizarAlquiler(juan, auto, LocalDate.of(2023, 10, 20), LocalDate.of(2023, 10, 25));
    	
    	
    }

    // Otros métodos relacionados con el sistema de alquiler
}

