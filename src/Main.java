import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Producto> listaDeCompras = new ArrayList<Producto>();
		listaDeCompras.add(new Bebida("Coca-Cola Zero", 1.5, 20));
		listaDeCompras.add(new Bebida("Coca-Cola", 1.5, 18));
		listaDeCompras.add(new Higiene("Shampoo Sedal", 500, "ml", 19));
		listaDeCompras.add(new Fruta("Frutillas", 64, "kilo"));
		
		
		for(Producto p : listaDeCompras) {
			System.out.println(p.toString());			
		}
		System.out.println("=============================");
		
		System.out.println("Producto mas Caro: " + listaDeCompras.stream().max(Producto::compareTo).get().getNombre());
		System.out.println("Producto mas Barato: " + listaDeCompras.stream().min(Producto::compareTo).get().getNombre());
	}
}
