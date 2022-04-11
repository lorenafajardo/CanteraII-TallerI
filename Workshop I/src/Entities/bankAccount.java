
/**
 * @author Lorena Fajardo Díaz
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
	 * @param accountNumber   Número de cuenta bancaria
	 * @param activated      Estado activado o desactivado
	 */
	public bankAccount(int accountNumber, boolean activated) {
		super();
		this.accountNumber = 12098388;
		this.activated = true;
	}
	
	/**
	 * Método Get/Is para obtener el estado de la cuenta
	 * @return  Cuenta activo / Cuenta desactiva
	 */
	public boolean isActivated() {
		return activated;
	}
	
	/**
	 * Método Set para definir el estado de la cuenta
	 * @param activated  activado/desactivado
	 */
	public void setActivated(boolean activated) {
		this.activated = true;
	}
	
}
