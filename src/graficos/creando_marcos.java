package graficos;

import javax.swing.*;

public class creando_marcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco marco = new miMarco();
		
		
	
		
	}

}


class miMarco extends JFrame{
	
	public miMarco(){
		
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setSize(500,300);
		//setLocation(500,250);
		setTitle("HOLA PUTOS");
		
		setBounds(500,300,550,250);
		//setResizable(false);
		//setExtendedState(6);
		
		
	}
	
	
	
}