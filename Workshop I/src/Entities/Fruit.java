
/**
 * @author Lorena Fajardo Díaz
 * Taller I : Manejo de Clases y Objetos en Java 
 */

package Entities;

import java.util.ArrayList;

public class Fruit {
	
	/**
	 * Atributos de la clase Fruit 
	 */
	public String name;
	private float averageWeight;
	public ArrayList<String> colors;
	
	/**
	 * Constructor de la clase Fruit 
	 * @param name  Nombre de la fruta
	 * @param averageWeight  Peso promedio
	 * @param colors  Colores
	 */
	public Fruit(String name, float averageWeight, ArrayList<String> colors) {
		super();
		this.name = "";
		this.averageWeight = 0;
		this.colors = colors;
	}
	
	/**
	 * Metodo Get para obtener la lista de colores
	 * @return colores
	 */
	public ArrayList<String> getColors() {
		return colors;
	}
	
	/**
	 * Método Set para definir la lista de colores 
	 * @param colors colores
	 */
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
}
