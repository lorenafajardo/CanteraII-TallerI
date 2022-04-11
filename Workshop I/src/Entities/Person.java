
/**
 * @author Lorena Fajardo Díaz
 * Taller I : Manejo de Clases y Objetos en Java 
 */

package Entities;

import java.util.Date;

public class Person {
	
	/**
	 * Atributos de la clase Person
	 */
	public String name;
	public String lastName1;
	public String lastName2;
	public Date dateBirth;
	public float height;
	public float weight;
	
	/**
	 * Constructor de la clase Person
	 * 
	 * @param name  Nombre de la persona
	 * @param lastName1  Apellido 1
	 * @param lastName2  Apellido 2
	 * @param dateBirth  Fecha de nacimiento
	 * @param height   Estatura
	 * @param weight   Peso
	 */
	
	public Person(String name, String lastName1, String lastName2, Date dateBirth, float height, float weight) {
		super();
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.dateBirth = dateBirth;
		this.height = height;
		this.weight = weight;
	}

	/**
	 * * Metodo Set para definir el nombre de la persona
	 * @param name nombre 
	 */
	 
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Metodo Get para  obtener el nombre de la persona
	 * @return Nombre 
	 */

	public String getName() {
		return name;
	}
}
