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
	
	

}
