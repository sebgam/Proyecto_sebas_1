import javax.swing.JOptionPane;

public class Juego_do_while_pes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero="";
		
		do {
			genero = JOptionPane.showInputDialog("introduce tu genero (H/M)");
			
			
			
			
			
			
			
		} while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce altura"));
		
		int pesoideal =0;
		
		if(genero.equalsIgnoreCase("H")){
			pesoideal = altura-110;
		}
		
		else if(genero.equalsIgnoreCase("M")){
			pesoideal= altura-120;
		}
		
		System.out.println("tu peso ideal es " + pesoideal);
		
	}

}
