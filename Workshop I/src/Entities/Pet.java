package Entities;

public class Pet {
	
	/*Atributos de la clase Pet*/
	
	public String typePet;
	public String name;
	public int age;
	private String ownerName;
	protected String identificationNnumber;
	
	/*Metodos Get y Set para ownerName*/
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	

}
