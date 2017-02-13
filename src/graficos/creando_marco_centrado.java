package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

public class creando_marco_centrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marco_centrado marco= new marco_centrado();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	marco.setVisible(true);

	
	
		
	}

}


class marco_centrado extends JFrame{
	
	public marco_centrado()
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