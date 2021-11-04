import java.util.ArrayList;
public class Zoo {
	private ArrayList<Animals> anls = new ArrayList<>();
	private Veterinaria v = new Veterinaria(Main.CapturaEntrada.CapturarString("Introduce nombre del Veterinario"),Main.CapturaEntrada.capturaDoble("Introduce Salario"));
	public void agregar(String animal){
		animal = animal.trim().toLowerCase();
		Animals a = null;
		switch(animal){
		case "perro" -> {
			a = new Dog(Main.CapturaEntrada.CapturarString("Introduce Nombre"),Main.CapturaEntrada.capturarEntero("Introduce Edad"));
			break;
			}
		case "gato" -> {
			a = new Cat(Main.CapturaEntrada.CapturarString("Introduce Nombre"),Main.CapturaEntrada.capturarEntero("Introduce Edad"));
			break;
			}
		case "fish" -> {
			a = new Fish(Main.CapturaEntrada.CapturarString("Introduce Nombre"),Main.CapturaEntrada.capturarEntero("Introduce Edad"));
			break;
			}
		case "pajaro" -> {
			a = new Bird(Main.CapturaEntrada.CapturarString(" Introduce Nombre"),Main.CapturaEntrada.capturarEntero("Introduce Edad"));
			break;
			}
		default -> {
			System.out.println("Error, volver a intentar");
			}
		}
		if(a != null){
			anls.add(a);
		}
}
	public void imprimir(){
		for(Animals a: anls){
			a.eat(); v.vacunar(a); v.revisar(a);
			if(a instanceof Dog){
				((Dog)a).ladrar();
				}
			else if(a instanceof Cat){
				((Cat)a).aruñar();
				}
			else if(a instanceof Fish) {
				((Fish)a).nadar();
			}
			else if(a instanceof Bird){
				((Bird)a).volar();
				}
			System.out.println();
			}
	}
	public void quitar(){
		int i = 1, op;
		for(Animals a: anls){
			System.out.println("Numero de animal: " + i); System.out.print(a.nombre + "\n"); i++;
			}
		op = Main.CapturaEntrada.capturarEntero("Introduce el numero"); anls.remove((op-1));
		System.out.println("<< ANIMAL BORRADO EXITOSAMENTE >>");
		}
	}

