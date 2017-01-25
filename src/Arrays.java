

import javax.swing.JOptionPane;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] meses ={"","enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre", "diciembre"};
		
		int numero_mes = Integer.parseInt(JOptionPane.showInputDialog("inserte numero de mes"));
		
		if (numero_mes>12 || numero_mes<=0){
			System.out.println("debe insertar un numero menor que 13 y mayor que 0");
		}else{
			
			System.out.println("el mes seleccionado es " + meses[numero_mes]);
			
			
}

		for(int i=0;i<meses.length;i++){
			
			System.out.print(meses[i] + " \n ");
			
			
		}
		
		
		
		
		
	
	}
	
	

}
