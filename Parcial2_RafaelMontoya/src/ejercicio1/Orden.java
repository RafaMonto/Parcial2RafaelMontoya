package ejercicio1;

public class Orden {
	public double precioTotal(double precio, double descuento) {
		double descuentoPrecio = precio - descuento;
		double precioImpuesto = descuentoPrecio + (descuentoPrecio * 0.1);
		return precioImpuesto;
		//Se reemplaza dos funciones iniciales por una sola que haga las dos tareas
	}
}
