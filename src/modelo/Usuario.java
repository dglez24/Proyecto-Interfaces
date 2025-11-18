package modelo;

public abstract class Usuario {
	
	protected String Nombre;
	protected String Apellidos;
	protected String Correo;
	protected String Contra;
	protected int pedido;
	protected int tirada;
	protected boolean admin;
	
	public Usuario(String nombre, String apellidos, String correo, String contra) {
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Correo = correo;
		this.Contra = contra;
		this.pedido = 0;
		this.tirada = 1;
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
	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	public int getTirada() {
		return tirada;
	}

	public void setTirada(int tirada) {
		this.tirada = tirada;
	}
	

}
