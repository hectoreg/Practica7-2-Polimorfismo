
public abstract class Persona {
	
	private String nombre;
	private int anyoNacimiento;
	
	public Persona(String nombre, int anyoNacimiento) {
		
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnyoNacimiento() {
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		this.anyoNacimiento = anyoNacimiento;
	}
	
	public String toString() {
		
		String mensaje = "La persona es " + nombre + " y nació en " + anyoNacimiento + ".";
		
		return mensaje;
		
	}
	
	public abstract double calculaDescuento(double cantidad);


}
