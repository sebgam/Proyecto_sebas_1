package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

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
		
		
		
		
	}
	
	

}
