import javax.swing.JOptionPane;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = JOptionPane.showInputDialog("inserta nombre");
		double id = Double.parseDouble(JOptionPane.showInputDialog("inserte su numero de id"));
		
		
		persona nombre_persona = new persona(nombre, id);
		
		
		System.out.println(nombre_persona.dime_persona()+ " y tu id es: " +nombre_persona.dime_id());
		
		
		
		

}
		

	}
	
	
	class persona{
		
		public persona(String nombre, double id){
			
			nombre_persona = nombre;
			
			id_persona = id;
		}
		
		
		public String dime_persona(){
			
			return "hola puto tu nombre es: " + nombre_persona;
		}
		
		public double dime_id(){
			return  id_persona;
		}
		
		
		private String nombre_persona;
		private double id_persona;
		
		
		
	}
	
	
	

