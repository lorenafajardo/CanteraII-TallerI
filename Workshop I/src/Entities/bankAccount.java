
/**
 * @author Lorena Fajardo D�az
 * Taller I : Manejo de Clases y Objetos en Java 
 */

package Entities;

public class bankAccount {

	/**
	 * Atributos de la clase bankAccount
	 */
	private int accountNumber;
	protected boolean activated;
	
	/**
	 * Constructor de la clase bankAccount
	 * @param accountNumber   N�mero de cuenta bancaria
	 * @param activated      Estado activado o desactivado
	 */
	public bankAccount(int accountNumber, boolean activated) {
		super();
		this.accountNumber = 12098388;
		this.activated = true;
	}
	
	/**
	 * M�todo Get/Is para obtener el estado de la cuenta
	 * @return  Cuenta activo / Cuenta desactiva
	 */
	public boolean isActivated() {
		return activated;
	}
	
	/**
	 * M�todo Set para definir el estado de la cuenta
	 * @param activated  activado/desactivado
	 */
	public void setActivated(boolean activated) {
		this.activated = true;
	}
	
}
