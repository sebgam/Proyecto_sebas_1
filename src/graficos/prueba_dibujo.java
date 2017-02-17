package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;

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
		
		Graphics2D g2=(Graphics2D) g;
	     
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		 
		g2.draw(rectangulo);
		
		Ellipse2D elipse= new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double CentroenX = rectangulo.getCenterX();
		double centroenI = rectangulo.getCenterY();
		double radio = 150;
		
		Ellipse2D circulo = new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroenX, centroenI, CentroenX+radio, centroenI+radio);
		
		g2.draw(circulo);
		
		
	}
	
	
}
