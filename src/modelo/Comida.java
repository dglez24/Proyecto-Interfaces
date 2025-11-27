package modelo;

public class Comida {
	private String Nombre;
	private String Foto;
	private double Precio;
	private int Cantidad,tipo,vendido;
	
	
	public Comida(String Nombre, String Foto, double Precio, int Cantidad,int tipo) {
		this.Nombre = Nombre;
		this.Foto = Foto;
		this.Precio = Precio;
		this.Cantidad = Cantidad;
		this.tipo=tipo;
		this.vendido=0;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getFoto() {
		return Foto;
	}


	public void setFoto(String foto) {
		Foto = foto;
	}


	public double getPrecio() {
		return Precio;
	}


	public void setPrecio(double precio) {
		Precio = precio;
	}


	public int getCantidad() {
		return Cantidad;
	}


	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getVendido() {
		return vendido;
	}

	public void setVendido(int vendido) {
		this.vendido = vendido;
	}
	
	
	
}
