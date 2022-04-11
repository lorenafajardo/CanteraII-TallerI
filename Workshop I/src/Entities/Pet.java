
/**
 * @author Lorena Fajardo Díaz
 * Taller I : Manejo de Clases y Objetos en Java 
 */

package Entities;

public class Pet {
	
	/**
	 * Atributos de la clase Pet
	 */
	public String typePet;
	public String name;
	public int age;
	private String ownerName;
	protected int identificationNnumber;
	
	/**
	 * Constructor de la clase Pet
	 * @param typePet  Tipo de mascota (pajaro, perro, gato, pez.. etc)
	 * @param name   Nombre de la mascota
	 * @param age    Edad de la mascota
	 * @param ownerName   Nombre del propietario
	 * @param identificationNnumber   Número de idetificacion del propietario
	 */
	
	public Pet(String typePet, String name, int age, String ownerName, int identificationNnumber) {
		super();
		this.typePet = "Perro";
		this.name = "Teo";
		this.age = 5;
		this.ownerName = "Maria";
		this.identificationNnumber = 102939992;
	}
	
	/**
	 * Método Get para obtener el nombre del propietario
	 * @return Nombre del propietario
	 */
	public String getOwnerName() {
		return ownerName;
	}
	
	/**
	 * Método Set para defiir el nombre del propietario
	 * @param ownerName  Nombre del propietario
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = "Maria";
	}
	

}
