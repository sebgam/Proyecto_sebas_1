package poo;

import java.util.Date;
import java.util.GregorianCalendar;


public class Uso_persona {

	public static void main(String[] args) {
		
		persona[] lasPersonas =new persona[2];
		
		lasPersonas[0]=new Empleado2("sebas", 25000, 2016, 12, 15);
		lasPersonas[1]=new alumno("luis", "ingenieria de sistemas");
		
		for (persona p : lasPersonas) {
			System.out.println(p.dime_nombre() +", "+ p.dame_descripcion());
			
		}

	}
	
	
}

//--------------------------CREA CLASE PERSONA------------------METODO ABSTRACTO-------------------------la clase y el metodo deben ser abstractos---------

abstract class persona{
	
	public persona(String nom){
		nombre=nom;
	}
	
	
	public String dime_nombre(){
		return nombre;
	}
	
	public abstract String dame_descripcion();//----METODO ABSTRACTO-----
	
	
	
	private String nombre;//-----------VARIABLE--------
}


 



//------------------------------------------CLASE EMPLEADO--------------------------------------------

class Empleado2 extends persona{
	
	
	public Empleado2(String nom,double sue, int agno, int mes, int dia){
		
		super(nom);//----------DEBE RECIBIR EL CONTRUCTOR DE LA CLASE PADRE-----------------
		
		sueldo= sue;
		GregorianCalendar calendario =new GregorianCalendar(agno,mes-1,dia);
		
		altaContrato= calendario.getTime();
		
		
		
		
	}
	 public String dame_descripcion(){
		 return "el empleado  " + dime_nombre() + " tiene un sueldo de = " + sueldo;
	 }
	
		
		public double dime_sueldo(){//---GETTER--------------------------
			return sueldo;
		}
		
		public Date dime_fecha(){//---GETTER--------------------------
			return altaContrato;
		}
		
		
		public void sube_sueldo(double porcentaje){//---------------SETTER------------------------------
			
			double aumento = sueldo*porcentaje/100;
			
			sueldo +=aumento;
			
			
		}
		
	
	private double sueldo;
	private Date altaContrato;
	
	}

//----------------CLASE ALUMNO--------------------------------------------------------------

 class alumno extends persona{
	 
	 public alumno(String nom, String car){
		 
		 super(nom);
		 carrera = car;
		 
	 }
	 
	 public String dame_descripcion(){
		 return"este alumno esta estudiando la carrera de " + carrera;
	 }
	 
	 
	 
	 
	 
	 private String carrera;
	 
 }



