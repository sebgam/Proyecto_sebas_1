package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;

	private int peso_plataforma;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero,climatizador;
	
	public Coche(){
	
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		
		peso_plataforma =500;
		
			
	}
	
	//getters muestra el valor de la variable STRING
	public String dimen_generales(){
		
		return "la plataforma del veiculo tiene " + ruedas + " ruedas " +" mide " +largo/1000 + " metros con un ancho de " + ancho + 
				" cm y un peso de plataforma de " + peso_plataforma +" kg";
		
		
		
		
		
		
	}
	
	//metodo setter modifica valor de una variable VOID
	public void color_coches(String color_coche){
		
		color= color_coche;
		
	}
	
	public String dime_color(){
		return "el color del coche es  " + color;
	}
	
	public void configura_asientos(String asientos_cuero){//-----------------------SETTER---------------
		
		if(asientos_cuero.equals("si")==true){
			this.asientos_cuero =true;
		}else{
			this.asientos_cuero= false;
		}
	}
	
	public String dime_asiento(){//-------------------------------GETTER---------------------
		if(asientos_cuero==true){
		 return "si tiene asiento de cuero";
		}else {
			return"el coche no tiene asientos de cuero";
		}
	}
	
	
	public void configura_climatizador(String climatizador){//-------------setter-----------------
		
		if(climatizador.equals("si")==true){
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
		
	}
	
	public String muestra_climatizador(){//---------------------------getter------
		if(climatizador==true){
			return" el auto si tiene climatizador";
		}else{
			return"el auto no tiene climatizador";
		}
		
		
	}
	
	
	
	public String dime_peso_coche() {
		int peso_carroceria=500;
		peso_total= peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true){
			peso_total= peso_total+50;
		}
		if(climatizador==true){
			peso_total= peso_total+20;
		}
		
		return "el peso total es de " + peso_total;
		
	}
	
	public int precio_coche(){
		
		int precio_final= 10000;
		
		if(asientos_cuero==true){
			precio_final += 2000;
		}
		if(climatizador== true){
			precio_final +=1500;
		}
		
		return precio_final;
		
	}
	
	
	
	
	
	
	
}








