
public class Dog extends Animals {
	public Dog(String nombre, int years){
		super(nombre, years);
		}
		public void eat(){
			System.out.println("<< El perro " + nombre + " esta comiendo sus croquetas >>");
		}
		public void moriderhueso(){
		System.out.println(nombre + "<< Esta mordiendo su hueso >>");
		}
		public void ladrar(){
		System.out.println(nombre + " Esta ladrando << WOOF WOOF >>");
		}
	}
