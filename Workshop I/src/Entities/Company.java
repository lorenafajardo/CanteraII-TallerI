
/**
 * @author Lorena Fajardo D�az
 * Taller I : Manejo de Clases y Objetos en Java 
 */

package Entities;

public class Company {
	
	/**
	 * Atributos de la clase Company
	 */
	public String name;
	public String address;
	protected int nit;
	private String businessName;
	
	/**
	 * Constructor de la clase Company
	 * @param name  Nombre de la empresa
	 * @param address  Direcci�n de la empresa
	 * @param nit  N�mero de Identificaci�n Tributaria de la empresa
	 * @param businessName    Razon social
	 */
	
	public Company(String name, String address, int nit, String businessName) {
		super();
		this.name = "STOP";
		this.address = "Cll 51#32b-36";
		this.nit = 22378192;
		this.businessName = "restaurantes S.A";
	}
	
	/**
	 * M�todo Get para obtener el NIT de la empresa
	 * @return nit
	 */
	protected int getNit() {
		return nit;
	}
	
	/**
	 * Metodo Set para definir el valor del nit 
	 * @param nit N�mero de Identificaci�n Tributaria de la empesa
	 */
	protected void setNit(int nit) {
		this.nit = nit;
	}
	
}
