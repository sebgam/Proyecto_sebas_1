package poo;

public class furgoneta extends Coche{

	private int capasidad_carga;
	private int plazas_extra;
	
	public furgoneta(int plazas_extra,int capasidad_carga){
	
	super();//llama al constructor del padre
	
	this.capasidad_carga = capasidad_carga;
	
	this.plazas_extra = plazas_extra;
	
	
	
	}
	
	public String dimeDatosFurgoneta(){
		
		return "la capasidad de carga es: " + capasidad_carga + " y las plazas son " + plazas_extra;
		
	}
	
	
	
	
	
}
