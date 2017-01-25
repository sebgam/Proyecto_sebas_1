import javax.swing.JOptionPane;

public class Fecha_nacimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int ano_nacimiento = Integer.parseInt(JOptionPane.showInputDialog("inserte año de nacimieto"));
		
		int mes_nacimiento = Integer.parseInt(JOptionPane.showInputDialog("inserte mes"));
		
		
		
		if(mes_nacimiento<11){
			int total_anos= 2016-ano_nacimiento;
			
			System.out.println("su edad es de " + total_anos + " años");
		}else{
int total_anos= 2015-ano_nacimiento;
			
			System.out.println("su edad es de " + total_anos + " años");
		}
		
		
		

	}

}
