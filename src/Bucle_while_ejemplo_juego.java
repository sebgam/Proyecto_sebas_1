

import javax.swing.JOptionPane;
public class Bucle_while_ejemplo_juego {

	public static void main(String[] args) {
		
		int numero_aleatorio=(int)(Math.random()*10);
		
		
		
		String numero= JOptionPane.showInputDialog("enserte numero");
		
		
		int numero1= Integer.parseInt(numero);
		
		int intentos = 0;
		
		while(numero_aleatorio!=numero1){
			
			if(numero_aleatorio>numero1){
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("inserte un numero mayor"));
			}else{
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("inserte un numero menor"));
			}
			
			intentos++;
		}
		
		System.out.println("ganaste el numero es " +numero_aleatorio +" puto numero de intentos " + intentos);
		

	}

}
