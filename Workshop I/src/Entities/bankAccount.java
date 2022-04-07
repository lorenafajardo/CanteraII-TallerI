
/**
 * @author Lorena Fajardo Díaz
 * 
 * Taller I : Creación de clases, con sus respectivos atributos, metodos y modificadores de acceso. 
 * 
 */

package Entities;

public class bankAccount {

	/*Atributos de la clase bankAccount*/
	
	private int accountNumber;
	protected boolean activated;
	
	/*Metodos Get y Set para activated*/
	
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
}
