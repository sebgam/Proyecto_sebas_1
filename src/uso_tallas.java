import java.util.*;


public class uso_tallas {


	
	enum talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private talla (String abreviatura){
			this.abreviatura = abreviatura;
			
		}
		
		public String dame_abreviatura(){
			return abreviatura;
		}
		
		
		
		private String abreviatura;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escribe talla mini, mediano, grande, muy grande");
		
		String entrada_datos = entrada.next().toUpperCase();
		
		talla la_talla=Enum.valueOf(talla.class, entrada_datos);
		
		System.out.println("tu talla es: " + la_talla);
		
		System.out.println("abreviatura= " + la_talla.dame_abreviatura());
		
	}

	
}
