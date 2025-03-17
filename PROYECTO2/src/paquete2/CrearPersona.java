package paquete2;

public class CrearPersona {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Maria", 30);
		persona1.mostrarInformacion();
		
		Persona persona2 = new Persona("Juan", 27);
		persona2.mostrarInformacion();
		
		System.out.println("----------------------------------------");
		System.out.println("Estudiantes");
		System.out.println("-----------");
		
		Estudiante estudiante1 = new Estudiante("Anna", 20, "A12345");
		estudiante1.mostrarInformacion();
		
		Estudiante estudiante2 = new Estudiante("Pedro", 18, "B54321");
		estudiante2.mostrarInformacion();
		
		Estudiante estudiante3 = new Estudiante("Lisa", 21, "C11223");	
		estudiante3.mostrarInformacion();
		
		Estudiante estudiante5 = new Estudiante("Pepe", 18, "D45678");
		estudiante5.mostrarInformacion();
		
		Estudiante estudiante6 = new Estudiante("Lalo", 19, "Z22222");
		estudiante6.mostrarInformacion();
		
		Estudiante estudiante7 = new Estudiante("JJ", 22, "R34420");
		estudiante7.mostrarInformacion();
	}

}
