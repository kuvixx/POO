package ar.edu.unlu.prog1.tp2.ej4;
import java.time.LocalDate;
public class Cuenta {
	private double saldo;
	private double limiteGiroDescubierto;
	private double giroDescubierto;
	private double saldoInvertido;
	public static final double INTERES_POR_INVERSION = 0.4;
	public static final double PLAZO_DIAS_INVERSION = 30;
	private LocalDate fechaInversion;

	public Cuenta(double saldo, double limiteGiroDescubierto) {
		this.saldo = saldo;
		this.limiteGiroDescubierto = limiteGiroDescubierto;
		this.giroDescubierto = 0;
		this.saldoInvertido = 0;
		this.fechaInversion = null;	
	}
	
	/**
	 * Dado un monto genera un gasto en la cuenta: quita del saldo el monto a gastar, si el monto es mayor
	 * al saldo entonces gira en descubierto (siempre y cuando todavía quede límite). 
	 * Si (saldo + limite descubierto disponible) < monto, entonces la operacion no se realiza y devuelve false.
	 * @param monto: el monto a gastar
	 * @return boolean: indica si la operación fué exitosa.
	 */
	
	public boolean gastar(double monto) {
		boolean res = false;
		
		if ((this.saldo + (this.limiteGiroDescubierto-this.giroDescubierto)) >= monto) {
			if (this.saldo < monto) {
				//Giro en descubierto
				this.giroDescubierto += monto - this.saldo;
				this.saldo = 0;
			}else {
				// El saldo me alzanza para el gasto
				this.saldo -= monto;
			}
			res = true;
		}
		
		return res;
	}
	
	/**
	 * Deposita el monto en la cuenta. Si existe giro en descubierto, primero intenta cubrirlo y si queda 
	 * dinero disponible aumenta el saldo.
	 * @param monto
	 */
	public void depositar(double monto) {
		// TODO Implementar....
	}
	
	/**
	 * Realiza la inversion del monto indicado. Condiciones para que la operación sea exitosa:
	 * 	a. Que el saldo sea >= monto
	 *  b. Que no exista una inversión activa.
	 *  
	 * Tambien establece la fecha de inversión.
	 * 
	 * @param monto
	 * @return
	 */
	public boolean invertir(double monto) {
		// TODO Implementar ...
		return true;
	}
	
	/**
	 * Devuelve el monto invertido al saldo con el interes establecido. Se puede realizar siempre y cuando 
	 * hayan pasado los N días que dura la inversión.
	 * @return
	 */
	public boolean recuperarInversion() {
		// TODO Implementar
		return true;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public double getGiroDescubierto() {
		return this.giroDescubierto;
	}
	
	public double getLimiteGiroDescubierto() {
		return this.limiteGiroDescubierto;
	}
	
	public double getMontoInvertido() {
		return this.saldoInvertido;
	}
	
	public double getInteresAGanar() {
		if (this.fechaInversion != null)
			return this.saldoInvertido * Cuenta.INTERES_POR_INVERSION;
		return 0.0d;
	}
}
