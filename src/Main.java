
public class Main {

	public static void main(String[] args) {
		
		Persona profesor = new Profesor("Jonay",1968);
		System.out.println(profesor.toString());
		System.out.print(profesor.calculaDescuento(500));
		Persona alumno = new Alumno("Héctor",1995);
		System.out.println("\n" + alumno.toString());
		System.out.print(alumno.calculaDescuento(500));

	}

}
