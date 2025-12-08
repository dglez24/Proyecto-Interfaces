package modelo;

public class Usuario {
	
	private  String Nombre;
	private String Apellidos;
	private String Correo;
	private String Contra;
	private int pedido,tirada;
	private boolean admin,valido;
	
	private int compras;
	
	public Usuario(String nombre, String apellidos, String correo, String contra,boolean admin) {
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Correo = correo;
		this.Contra = contra;
		this.pedido = 0;
		this.tirada = 100;
		this.admin=admin;
		this.valido=valido;
		
		this.compras = 0;
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
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

	public int getCompras() {
		return compras;
	}

	public void setCompras(int compras) {
		this.compras = compras;
	}
	
	

}
