package poo;

import java.util.*;

public class Uso_empleado {

	public static void main(String[] args) {
		
		
		jefatura jefe_rrhh = new jefatura("carlos jefe", 55000, 2006, 11, 29);
		jefe_rrhh.estableceIncentivo(20000);
		
		
		Empleado[] mis_empleados=new Empleado[6];//-------------construye array------------------
		
		mis_empleados[0]=new Empleado("juan", 85000, 1990, 11, 24);
		mis_empleados[1]=new Empleado("ana ", 75000, 1995, 05, 26);//--------instancia objeto de la clase empleado--------------
		mis_empleados[2]=new Empleado("sebas", 55000, 1950, 04, 21);
		mis_empleados[3]=new Empleado("hola putos");
		mis_empleados[4]= jefe_rrhh;//----------------------POLIMORFISMO (SUSTITUCION)-----------------
		mis_empleados[5]= new jefatura("maria jefe", 60000, 2016, 05, 15);
				
		jefatura jefa_finanzas =(jefatura) mis_empleados[5];
		
		jefa_finanzas.estableceIncentivo(55000);
		
		
		System.out.println(jefa_finanzas.tomar_decisiones("dar mas dias de vacaiones a los empleados"));
		
		
	
		
		for(Empleado e:mis_empleados){
			e.sube_sueldo(5);
		}
	   	
		
		Arrays.sort(mis_empleados);
		
		for(Empleado j: mis_empleados){
			System.out.println("Nombre: " + j.dime_nombre() + " Sueldo: " + j.dime_sueldo()+ " Fecha: " + 
					j.dime_fecha());
		}
		
		
	}

}



class Empleado implements Comparable{
	
	
	public Empleado(String nom,double sue, int agno, int mes, int dia){
		
		nombre =nom;
		sueldo= sue;
		GregorianCalendar calendario =new GregorianCalendar(agno,mes-1,dia);
		
		altaContrato= calendario.getTime();
		
		
		
	}
	public Empleado(String nom){
	this(nom, 30000,2000,01,01);
	}
	
	
	public String dime_nombre(){//---GETTER--------------------------
		
		return nombre;
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
		
		
	public int 	compareTo(Object miObjeto){
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo){
			return -1;
		}
		
		if(this.sueldo> otroEmpleado.sueldo){
			return 1;
		}
		
		return 0;
		
	}
		
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	}


 class jefatura extends Empleado implements jefes{

	public jefatura(String nom, int sue, int agno, int mes,int dia){//----------constructor
		
		super(nom, sue,agno,mes,dia);//-------- valores del constructor
		
		
		
	}

	public String tomar_decisiones(String decision){
		return "un miembro de la direccion a tomado la decision de: " + decision;
	}
	
	
	
	
	public void estableceIncentivo(double b){//--------------settter
		
		incentivo =b;
		
	}
	
	public double dime_sueldo(){//------------------getter
		
		double sueldoJefe = super.dime_sueldo();
		
		return sueldoJefe + incentivo;
		
		
	}
	
	
	
	
	
private double incentivo;




}



	
	
	
	
	
	
















