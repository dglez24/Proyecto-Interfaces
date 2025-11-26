package modelo;

public class Usuario {
	
	private  String Nombre;
	private String Apellidos;
	private String Correo;
	private String Contra;
	private int pedido,tirada;
	private boolean admin;
	private boolean g1;
	private boolean g2;
	private boolean g3;
	
	public Usuario(String nombre, String apellidos, String correo, String contra,boolean admin) {
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Correo = correo;
		this.Contra = contra;
		this.pedido = 0;
		this.tirada = 1;
		this.admin=admin;
		this.g1 = false;
		this.g2 = false;
		this.g3 = false;
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

	public boolean isG1() {
		return g1;
	}

	public void setG1(boolean g1) {
		this.g1 = g1;
	}

	public boolean isG2() {
		return g2;
	}

	public void setG2(boolean g2) {
		this.g2 = g2;
	}

	public boolean isG3() {
		return g3;
	}

	public void setG3(boolean g3) {
		this.g3 = g3;
	}

}
