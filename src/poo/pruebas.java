package poo;



import javax.swing.*;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("inserte nombre");
		String nombre2 = JOptionPane.showInputDialog("inserte nombre");
		String seccion = JOptionPane.showInputDialog("inserte seccion");

		empleados trabajador1 = new empleados(nombre);
		
		empleados trabajador2 = new empleados(nombre2);
		
		trabajador1.cambia_seccion(seccion);
		
		
		
		System.out.println(trabajador1.debuelve_datos()+ "\n y los datos del trabajador 2 son:\n "+
		trabajador2.debuelve_datos()+"\n"+ empleados.dame_id() );
	
	}

}


class empleados{

	public empleados(String nom){
		nombre=nom;
		seccion= "administracion";
		id=id_siguiente;
		id_siguiente++;
	}
	
	
	public void cambia_seccion(String seccion){
		this.seccion=seccion;
	}
	
	public String debuelve_datos(){
		return "el nombre del empleado es " + nombre+ " y su seccion es " + seccion+" y el id es: " + id;
	}
	
	public static String dame_id(){
		return" el id siguiente es "+ id_siguiente;
	}
	private final String nombre;
private String seccion;
private int id;
private static int id_siguiente=1;

}