package poo;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.util.*;



public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dameLaHora oyente = new dameLaHora();
		
		Timer miTemporizador = new Timer(5000, oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "pulsa aceptar para detener");
		
		System.exit(0);

	}

}


class dameLaHora implements ActionListener{
	
	
	
	public void actionPerformed(ActionEvent e){
		
		Date ahora =new Date();
		
		System.out.println("te pongo la hora cada 5 segundos: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
		
	}
	
	
}