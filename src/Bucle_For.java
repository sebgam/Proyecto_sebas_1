import javax.swing.JOptionPane;

public class Bucle_For {

	public static void main(String[] args) {
		
		
	int arroba = 0;
	boolean punto =false;
	
	String email = JOptionPane.showInputDialog("inserte correo");
	
	for(int i=0; i<email.length();i++){
		
		if(email.charAt(i)=='@'){
			arroba++;
		}
		
		if(email.charAt(i)=='.'){
			punto = true;
		}
	}
	
	if(arroba==1 && punto==true){
		System.out.println("la direccion "+ email + " es correcto");
	}else{
		System.out.println("es incorrecto");
	}
	
		
	}

}
