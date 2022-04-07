
/**
 * @author Lorena Fajardo Díaz
 * 
 * Taller I : Creación de clases, con sus respectivos atributos, metodos y modificadores de acceso. 
 * 
 */

package Entities;

import java.util.ArrayList;

public class Fruit {
	
	/*Atributos de la clase Fruit*/
	
	public String name;
	private float averageWeight;
	public ArrayList<String> colors;
	
	/*Metodos Get y Set para colors*/
	
	public ArrayList<String> getColors() {
		return colors;
	}
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	

}
