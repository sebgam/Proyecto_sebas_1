package graficos;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;

import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class colorear {

	public static void main(String[] args) {
		
		marco_centrado2 marco= new marco_centrado2();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	marco.setVisible(true);

	
	
		
	}

}


class marco_centrado2 extends JFrame{
	
	public marco_centrado2()
	{
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamano = mipantalla.getScreenSize();
		
		int alturapantalla = tamano.height;
		int anchopantalla = tamano.width;
		setSize(anchopantalla/2, alturapantalla/2);
		
		setLocation(anchopantalla/4, alturapantalla/4);
		
		setTitle("MARCO CENTRADO");
		
		 Image miicono = mipantalla.getImage("src/graficos/icono.png");
		 
		 setIconImage(miicono);
		 
		 dibujo viewDibujo = new dibujo();
		 add(viewDibujo);
		
		
		
		
	}
	
	class dibujo extends JPanel{
		
		public void paintComponent(Graphics g){
			super.paintComponent( g);
			
			Graphics2D g2=(Graphics2D) g;
		     
			Rectangle2D rectangulo = new Rectangle2D.Double(280,120,200,150);
			 
			g2.draw(rectangulo);
			
			Ellipse2D elipse= new Ellipse2D.Double();
			
			elipse.setFrame(rectangulo);
			
			g2.draw(elipse);
			
			
			
			double CentroenX = rectangulo.getCenterX();
			double centroenI = rectangulo.getCenterY();
			double radio = 150;
			
			Ellipse2D circulo = new Ellipse2D.Double();
			
			circulo.setFrameFromCenter(CentroenX, centroenI, CentroenX+radio, centroenI+radio);
			
			g2.draw(circulo);
		}
		
		
		
		
		
	}
	
	
	
	
	

}
