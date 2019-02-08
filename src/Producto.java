abstract public class Producto implements Comparable<Producto>{
	private String nombre;
	private int precio;
	private String separator = " /// ";
	
	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;

	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setSeparator(String separator) {
		this.separator = separator;
	}
	
	public String getSeparator() {
		return separator;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int compareTo(Producto o) {
		return this.getPrecio() - o.getPrecio();
	}
	
	@Override
	public String toString() {
		return "";
	}
}
