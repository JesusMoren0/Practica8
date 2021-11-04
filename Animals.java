
public class Animals {
	String nombre;
	int years;
	boolean vacuna;
	public Animals(String nombre, int years){
	this.nombre = nombre;
	this.years = years;
	}
	public void eat(){
	System.out.println(nombre +" << ESTA COMIENDO >>");
	}
	public void sleep(){
	System.out.println(nombre + " << ESTA DURMIENDO >>");
	}
	public void setVacuna(boolean vacuna){
	this.vacuna = vacuna;
	}
}
