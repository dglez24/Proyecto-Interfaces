package modelo;

public class Comida {
	private String Nombre;
	private int Tipo;
	private String Foto;
	private double Precio;
	private int Cantidad;
	
	
	public Comida(String Nombre, int Tipo, String Foto, double Precio, int Cantidad) {
		this.Nombre = Nombre;
		this.Tipo = Tipo;
		this.Foto = Foto;
		this.Precio = Precio;
		this.Cantidad = Cantidad;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public int getTipo() {
		return Tipo;
	}


	public void setTipo(int tipo) {
		Tipo = tipo;
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
	
	

}
