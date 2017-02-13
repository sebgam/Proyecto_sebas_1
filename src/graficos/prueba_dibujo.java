package graficos;

import java.awt.Graphics;


import javax.swing.JFrame;
import javax.swing.JPanel;

public class prueba_dibujo {

	public static void main(String[] args) {
		// TODO Auto-ge
		
		marcoConDibujos marcoDibujos = new marcoConDibujos();
		
		marcoDibujos.setVisible(true);
		marcoDibujos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class marcoConDibujos extends JFrame{
	
	public marcoConDibujos(){
		
		setTitle("prueba de dibujo");
		setSize(400,400);
		
		laminaDibujo miiLamina = new laminaDibujo();
		add(miiLamina);
		
		
	}
	
	
	
}


class laminaDibujo extends JPanel{
	
	
	public void paintComponent( Graphics g){
		super.paintComponent( g);
		
		g.drawRect(50, 50, 250, 100);
		g.drawString("hola mundo", 100, 80);
	     
		 
		
		
		
		
	}
	
	
}
