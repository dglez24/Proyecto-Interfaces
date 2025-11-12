package modelo;

public class Cliente extends Usuario{
	
	private int pedido;

	public Cliente(String nombre, String apellidos, String correo, String contra) {
		super(nombre, apellidos, correo, contra);
		this.admin = false;
		this.pedido = 0;
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "Cliente [pedido=" + pedido + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Correo=" + Correo
				+ ", Contra=" + Contra + ", admin=" + admin + ", getPedido()=" + getPedido() + ", getNombre()="
				+ getNombre() + ", getApellidos()=" + getApellidos() + ", getCorreo()=" + getCorreo() + ", getContra()="
				+ getContra() + ", isAdmin()=" + isAdmin() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	

}
