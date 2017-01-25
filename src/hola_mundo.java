import javax.swing.JOptionPane;

public class hola_mundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("hola mundo");
		
		String mi_nombre = JOptionPane.showInputDialog("inserta tu nombre");
		int mi_edad = Integer.parseInt(JOptionPane.showInputDialog("inserta edad"));
		
		
		System.out.println("tu nombre es " + mi_nombre +" y mi edad es " + mi_edad);
		
	
	
	}

}
