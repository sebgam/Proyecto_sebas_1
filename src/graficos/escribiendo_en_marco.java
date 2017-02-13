package graficos;

import javax.swing.*;
import java.awt.*;

public class escribiendo_en_marco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marcoConTexto miMarco = new marcoConTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class marcoConTexto extends JFrame{
	
	public marcoConTexto(){
		
		setVisible(true);
		setSize(600,450);
		setLocation(500,250);
		setTitle("PRIMER TEXTO");
		
		lamina miLamina= new lamina();
		add(miLamina);
		
		
		
	}
		
}

class lamina extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		g.drawString("hola mundo", 100, 100);
		
	}
	
	
}