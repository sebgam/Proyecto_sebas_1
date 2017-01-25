
public class manipula_Cadenas_2 {

	public static void main(String[] args) {
		
		String frase = "hoy es un estupendo dia para aprender a programar en java";
		
		String frase_resumen= frase.substring(29);
		
		
		int numero_Caracteres = frase.length();
		
		System.out.println(frase_resumen);
		
		System.out.println(frase.substring(29, numero_Caracteres));
		

	}

}
