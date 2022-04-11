
/**
 * @author Lorena Fajardo D�az
 * Taller I : Manejo de Clases y Objetos en Java 
 */

package Entities;

public class Car {
	
	/**
	 * Atributos de la clase Car
	 */
	
	protected String plateNumber;
	public String Model;
	public String ownerName;
	protected int ownerIdentification;
	
	/**
	 * Declaraci�n del constructor de la clase Car
	 * @param plateNumber  Placa del carro
	 * @param model   Modelo del carro
	 * @param ownerName  Nombre del propietario
	 * @param ownerIdentification  Identificaci�n del propietario 
	 */
	
	public Car(String plateNumber, String model, String ownerName, int ownerIdentification) {
		super();
		this.plateNumber = "GFR456";
		this.Model = "Mazda";
		this.ownerName = "Carlos";
		this.ownerIdentification = 12637288;
	}
	
	/**
	 * M�todo Get para obtener la placa del carro
	 * @return placa
	 */
	protected String getPlateNumber() {
		return plateNumber;
	}
	
	/**
	 * M�todo Set para definir la placa del carro 
	 * @param plateNumber
	 */
	protected void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
}
