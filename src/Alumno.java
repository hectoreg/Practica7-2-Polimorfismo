
public class Alumno extends Persona {
	
	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Alumno(String nombre, int anyoNacimiento) {
		super(nombre, anyoNacimiento);
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		
		String mensaje = "El alumno " + super.getNombre() + " nació en " + super.getAnyoNacimiento() + ".";
		
		return mensaje;
		
		
	}

	public double calculaDescuento(double cantidad) {
	
		System.out.println("Se ha introducido una cantidad de " + cantidad + ".Se aplica un descuento del 10%: ");
		cantidad = cantidad * 0.1;
		return cantidad;
	
}

}
