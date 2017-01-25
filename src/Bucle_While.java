import javax.swing.JOptionPane;

public class Bucle_While {

	public static void main(String[] args) {
		
		String password= JOptionPane.showInputDialog("inserte contraseña");
		int numero_intentos = 1;
		String pw="sebas";
		
		
		while(password.equals(pw)==false){//equals operador de comparacion 
		
			password = JOptionPane.showInputDialog("contraseña incorrecta inserte contraseña nuevamente");
			
			numero_intentos++;

	}
System.out.println("usuario correcto \n bienvenido " + password + " numero de intentos " + numero_intentos);
	}
	
}
