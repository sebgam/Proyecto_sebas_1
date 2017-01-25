

import javax.swing.JOptionPane;

public class Entrada_De_Numeros {

	public static void main(String[] args) {
		
		String num1 = JOptionPane.showInputDialog("introduce primer numero");
		
		String num2= JOptionPane.showInputDialog("introduce segundo  numero");
		
		double numero1  = Double.parseDouble(num1);
		
		double numero2  = Double.parseDouble(num2);
		
		System.out.print("la raiz de " + numero1 + " es ");
		
		System.out.printf("%1.1f", Math.sqrt(numero1));
		
		System.out.println("y la suma de los dos numeros es " + (numero1+numero2));

	}

}
