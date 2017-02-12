package graficos;

import javax.swing.*;

public class creando_marcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco marco = new miMarco();
		
		marco.setVisible(true);

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
	}

}


class miMarco extends JFrame{
	
	public miMarco(){
		
		//setSize(500,300);
		//setLocation(500,250);
		setTitle("HOLA PUTOS");
		
		setBounds(500,300,250,250);
		
	}
	
	
	
}