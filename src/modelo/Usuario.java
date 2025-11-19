package modelo;

public abstract class Usuario {
	
	protected String Nombre;
	protected String Apellidos;
	protected String Correo;
	protected String Contra;
	protected boolean admin;
	
	public Usuario(String nombre, String apellidos, String correo, String contra) {
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Correo = correo;
		this.Contra = contra;
		this.admin=false;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getContra() {
		return Contra;
	}

	public void setContra(String contra) {
		Contra = contra;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	

}
