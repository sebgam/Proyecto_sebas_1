import javax.swing.JOptionPane;

public class Condicional_If {

	public static void main(String[] args) {

		String edad= JOptionPane.showInputDialog("introduce edad");
		
		int edad_usuario = Integer.parseInt(edad);
		
		if (edad_usuario < 18){
			System.out.println("tu edad es " + edad + " eres joven");
		}else if(edad_usuario >=18 && edad_usuario<= 30){
			System.out.println("tu edad es " + edad + " eres adolecente");
		}else if(edad_usuario >30 && edad_usuario<= 100){
			System.out.println("tu edad es " + edad + " estas viejo");
		}else{
			System.out.println("estas muerto");
		}

	}

}
