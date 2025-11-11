package modelo;

public class Administrador extends Usuario{

	public Administrador(String nombre, String apellidos, String correo, String contra) {
		super(nombre, apellidos, correo, contra);
		this.admin = true;
	} 

}
