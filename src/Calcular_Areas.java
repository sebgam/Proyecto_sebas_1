import java.util.*;
import javax.swing.*;


public class Calcular_Areas {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("elige una opcion: \n 1:Cuadrado \n 2:Rectangulo \n 3:Triangulo \n 4:Circulo");
		
		int figura = entrada.nextInt();
		
		switch (figura) {
		case 1:
			
			int lado= Integer.parseInt(JOptionPane.showInputDialog("inserte lado"));
			
			System.out.println("el area del Cuadrado es de " + Math.pow(lado, 2));
			
			
			break;
			
		case 2:
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
			
			System.out.println("el area del rectangulo es " + (base*altura));
			break;
			
		case 3:
			
			base =Integer.parseInt(JOptionPane.showInputDialog("introduce base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura"));
			
			System.out.println("el area del triangulo es " + (base*altura)/2);
			break;
			
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("introduce radio"));
			System.out.print("el area del circulo es ");
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			
			break;
			
		default:
			System.out.println("la instruccion no es correcta");
			
		}
		
	}

}
