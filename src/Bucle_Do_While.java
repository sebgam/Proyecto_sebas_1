import javax.swing.JOptionPane;

public class Bucle_Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero_aleatorio = (int)(Math.random()*10);
		
		
		
		int intentos =0;
		
		int numero_1=0;
		String numero = JOptionPane.showInputDialog("enserte numero");
		do {
			
		   numero_1 = Integer.parseInt(numero);
			intentos ++;
			
		
	     if(numero_aleatorio < numero_1){
			numero = JOptionPane.showInputDialog("enserte numero menor");
		}
		else if(numero_aleatorio>numero_1){
			numero = JOptionPane.showInputDialog("enserte numero mayor");
		}
			
			
		} while (numero_1 != numero_aleatorio);
		
		
		
		System.out.println("felicidades el numero es correcto numero de intentos: " + intentos );
		
		
		
		
		
		
	}

}
