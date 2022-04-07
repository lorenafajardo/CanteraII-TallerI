
/**
 * @author Lorena Fajardo Díaz
 * 
 * Taller I : Creación de clases, con sus respectivos atributos, metodos y modificadores de acceso. 
 * 
 */

package Entities;

import java.util.Date;

public class Person {
	
	/*Atributos de la clase Person*/
	
	public String name;
	public String lastName1;
	public String lastName2;
	public Date dateBirth;
	public float height;
	public float weight;
	
	/*Metodos Get y Set para name*/
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	

}
