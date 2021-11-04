
public class Veterinaria {
	
	private String nombre;
	private double salario;
	
	public Veterinaria (String nombre, double salario){
	setSalario(salario);setNombre(nombre);
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public double getSalario(){
		return salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void vacunar(Animals an){
		an.setVacuna(true);
	}
	public void revisar(Animals an){
		if(an.vacuna) {
			System.out.println(an.nombre + " << ESTA VACUNADO >>");
	}
	else{
		System.out.println(an.nombre + "<< NO ESTA VACUNADO >> ");
		}
	}
}
