import java.util.Scanner;

public class entrada_Ejemplo_1 {

	public static void main(String[] args) {
	
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce tu nombre, porfavor");
		
		String nombre_Usuario = entrada.nextLine();
		
		System.out.println("introduce edad porfavor");
		
		int edad = entrada.nextInt();
		
		System.out.println("hola " + nombre_Usuario + " el año que viene tendras " + (edad+1));

	}

}
