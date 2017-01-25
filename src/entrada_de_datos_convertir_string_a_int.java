import javax.swing.JOptionPane;

public class entrada_de_datos_convertir_string_a_int {

	public static void main(String[] args) {
		
		String nombre_usuario = JOptionPane.showInputDialog("introduce tu nombre porfavor");//entrada de datos
		
		String edad = JOptionPane.showInputDialog("introduce tu edad");//entrada de datos
		
		int edad_usuario = Integer.parseInt(edad);// convierte string en entero
		
		System.out.println("tu nombre es "+ nombre_usuario + " y tu edad es de " + (edad_usuario+1) + " años");//salida de datos
		

	}

}
