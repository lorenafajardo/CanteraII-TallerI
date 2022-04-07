
/**
 * @author Lorena Fajardo Díaz
 * 
 * Taller I : Creación de clases, con sus respectivos atributos, metodos y modificadores de acceso. 
 * 
 */

package Entities;

public class Car {
	
	/*Atributos de la clase Car*/
	
	protected String plateNumber;
	public String Model;
	public String ownerName;
	protected String ownerIdentification;
	
	/*Metodos Get y Set para plateNumber*/
	
	protected String getPlateNumber() {
		return plateNumber;
	}
	protected void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
}
