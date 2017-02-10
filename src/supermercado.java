import javax.swing.JOptionPane;

public class supermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("nombre");
		String apellido = JOptionPane.showInputDialog("apellido");
		int cedula = Integer.parseInt(JOptionPane.showInputDialog("cedula"));
		
		clientes informacion = new clientes(nombre, apellido, cedula);
		
		
		System.out.print(informacion.solodimecedula());
		
		
		

	}

}

class clientes{
	
	public clientes(String nom, String ape, int ced){
		
		nombre= nom;
		apellido = ape;
		cedula= ced;
		
		
		
	}
	
	public String muestrainfo(){
		
		return "hola puto tu nombre es " + nombre +" y tu apellido es " + apellido+ " y tu numero de cedula es " + cedula;
		
	}
	
	public String solodimecedula(){
		
		return "tu nombre es " + nombre + " y tu cedula es " + cedula;
	}
	
	
	
	
	private int cedula;
	private String nombre;
	private String apellido;
	
}