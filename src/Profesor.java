
public class Profesor extends Persona  {
	
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Profesor(String nombre, int anyoNacimiento) {
		super(nombre, anyoNacimiento);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		
		String mensaje = "El profesor " + super.getNombre() + " nació en " + super.getAnyoNacimiento() + ".";
		
		return mensaje;
		
		
	}
	
	public double calculaDescuento(double cantidad) {
		
		System.out.println("Se ha introducido una cantidad de " + cantidad + ".Se aplica un descuento del 2%: ");
		cantidad = cantidad * 0.02;
		return cantidad;
		
	}

}
