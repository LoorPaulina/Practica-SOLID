
public class Compra implements Pagable{ //SE IMPLEMENTA LA INTERFAZ PAGABLE
	private Pagable pago; //se crea un objeto tipo pagable
	private List articulos;
	public Compra(Pagable pago) { //ahora el constructor solo recibe la interfaz, ya se cumple DIP
		//inicializaciones
	}

	
	public void agregarArticulo(Articulo articulo) {
		//agregar un articulo a la compra
	}
	public void removerArticulo(Articulo articulo) {
		//remover un articulo a la compra
	}
}
