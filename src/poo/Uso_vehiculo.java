package poo;



public class Uso_vehiculo {

	public static void main(String[] args) {
		
		Coche miCohe1 = new Coche();
		
		miCohe1.color_coches("azul");
		
		furgoneta miFurgoneta1 = new furgoneta(7, 580);
		
		miFurgoneta1.color_coches("verde");
		miFurgoneta1.configura_asientos("si");
		miFurgoneta1.configura_climatizador("si");
		
		
		System.out.println(miCohe1.dimen_generales()+" "+miCohe1.dime_color());
		
		System.out.println(miFurgoneta1.dimen_generales()+" " + miFurgoneta1.dime_color()+" y "+miFurgoneta1.dimeDatosFurgoneta());
		System.out.print("hola mundo");
		
        
			
		
		
	}

}
