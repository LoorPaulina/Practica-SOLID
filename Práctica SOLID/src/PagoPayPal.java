
public class PagoPayPal {
	private boolean loggedIn; //conexion a cuenta PayPal
	@Override
	public void realizarCobro(double monto) {
		if(!loggedIn) {
			return;
		}
		
		//Cargar el monto de compra al medio de pago
	}
}
