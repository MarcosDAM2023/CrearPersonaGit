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
		
		System.out.println("-----FIN-----");
	}

}
