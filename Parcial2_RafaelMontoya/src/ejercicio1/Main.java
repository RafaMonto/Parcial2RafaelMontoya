package ejercicio1;

public class Main {
	public static void main(String[] args) {
		double precio = 45000, descuento = 10000;
		Orden orden = new Orden();
		double precioTotal = orden.precioTotal(precio, descuento);
		System.out.println("El precio de "+precio+" mas el descuento y el impuesto es de: "+precioTotal);
		System.out.println("");
		OrdenEstado ordenE = new OrdenEstado();
		int ordenId = 5;
		String resultado = ordenE.obtenerEstado(ordenId);
		System.out.println(resultado);
	}
}
