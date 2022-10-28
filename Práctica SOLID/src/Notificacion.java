
public class Notificacion {
	//private int tipoNotificacion;
	
	public void Notificacion(Notificable notificable ) { //se tiene un constructor que recibe
		//una interfaz que generara la notificacion dependiendo del tipo
		notifica = notificable;
	}
	
	public void notificar(Pago pago) {
		notifica.generarNotificacion(pago); //dependiendo del tipo de pago se genera la notificacion
		//esto envitaria que la clase se modifique a medida que se extiende.
	}
	//se cumple OCP
}
