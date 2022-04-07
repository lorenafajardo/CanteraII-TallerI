
/**
 * @author Lorena Fajardo Díaz
 * 
 * Taller I : Creación de clases, con sus respectivos atributos, metodos y modificadores de acceso. 
 * 
 */

package Entities;

public class Company {
	
   /*Atributos de la clase Company*/
	
	public String name;
	public String address;
	protected String nit;
	private String businessName;
	
	/*Metodos Get y Set para nit*/
	
	protected String getNit() {
		return nit;
	}
	protected void setNit(String nit) {
		this.nit = nit;
	}
	
}
