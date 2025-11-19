package modelo;

public class Comida {
	private String Nombre;
	private String Foto;
	private double Precio;
	private int Cantidad,Stock,tipo;
	
	
	public Comida(String Nombre, String Foto, double Precio, int Cantidad,int Stock,int tipo) {
		this.Nombre = Nombre;
		this.Foto = Foto;
		this.Precio = Precio;
		this.Cantidad = Cantidad;
		this.Stock=Stock;
		this.tipo=tipo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int tipo) {
		Stock = tipo;
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
