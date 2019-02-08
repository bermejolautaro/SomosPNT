
public class Higiene extends Producto {
	
	private int cantidad;
	private String unidad;

	public Higiene(String nombre, int cantidad, String unidad, int precio) {
		super(nombre, precio);
		this.cantidad = cantidad;
		this.unidad = unidad;
		
	}
	
	public String toString() {
		return "Nombre: " + getNombre() + getSeparator() + "Contenido: " + cantidad + unidad + getSeparator() + "Precio: $" + getPrecio();
	}

}
