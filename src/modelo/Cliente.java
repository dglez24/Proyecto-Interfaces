package modelo;

public class Cliente extends Usuario{
	
	private int pedido;
	private int tirada;

	public Cliente(String nombre, String apellidos, String correo, String contra) {
		super(nombre, apellidos, correo, contra);
		this.admin = false;
		this.pedido = 0;
		this.tirada = 1;
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
