package modelo;

public class Cliente extends Usuario{
	

	public Cliente(String nombre, String apellidos, String correo, String contra) {
		super(nombre, apellidos, correo, contra);
		this.admin = false;
	}



	 
	

}
