import javax.swing.JOptionPane;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long resultado = 1L;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("introduce numero"));
		
		for (int i = numero; i>0; i--){
			
			resultado=resultado*i;
			
		}
		
		System.out.println("el factorial del numero " + numero + " es " + resultado);
		
		
		

	}

}
