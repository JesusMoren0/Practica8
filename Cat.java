
public class Cat extends Animals {
	public Cat(String nombre, int years){
		
		super(nombre, years);
		}
	
		public void eat(){
		System.out.println("<< El gato " + nombre + " esta comiendo >>");
		}
		public void aruñar(){
		System.out.println("<< El gato " + nombre + " esta ronroneando >>");
		}
	}
