package poo;

import java.awt.Toolkit;
import java.awt.event.*;

import java.util.*;


import javax.swing.Timer;
import javax.swing.*;



public class prueba_temporizador_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reloj miReloj=new reloj();
		
		miReloj.en_marcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "pulsa aceptar para terminar");
		
		System.exit(0);
		
		
		

	}

}


class reloj{
	

	
	
	public void en_marcha(int intervalo,final boolean sonido){
		
		//clae interna local
		class damelahora2 implements ActionListener{
			
			public void actionPerformed(ActionEvent evento){
				
				Date ahora = new Date();
				
				System.out.println("te pongo la hora cada 3 segundos" + ahora);
				
				if(sonido){
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
			
		}
		
		
		// codigo de la clase
		ActionListener oyente = new damelahora2();
		
		Timer mitemporizador= new Timer(intervalo, oyente);
		
		mitemporizador.start();
		
	}
	
	
	
	
	
	
}















