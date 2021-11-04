
public class Fish extends Animals {
	public Fish( String nombre, int edad) {
		
		super(nombre, edad);
	}
	public void eat() {
		System.out.println(nombre + "<< ESTA COMIENDO SU COMIDA >>");
	}
	public void nadar() {
		System.out.println(nombre + "<< SE LA PASA NADANDO EN SU PECERA >>");
	}
	
}
