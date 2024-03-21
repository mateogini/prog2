package tp4Empresa;

public class Userfinal extends Persona {
	private String nombreUsuario;
	private String password;
	
	public Userfinal(String nombre, String apellido, int edad, String nombreUsuario, String password) {
		super(nombre, apellido, edad);
		this.nombreUsuario=nombreUsuario;
		this.password=password;
		// TODO Auto-generated constructor stub
	}

	public String getUser() {
		return nombreUsuario;
	}

	public void setUser(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
	    return "Nombre: " + super.getNombre() + ", Edad: " + super.getEdad() + " Usuario: " + getUser();
	}
	

}
