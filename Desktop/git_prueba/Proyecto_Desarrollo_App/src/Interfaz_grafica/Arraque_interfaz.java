package Interfaz_grafica;
import java.util.Scanner;
public class Arraque_interfaz {
	
	
	public static void main (String[] args) {
		
		//Creamos la instancia al objeto
		Scanner pregunta = new Scanner(System.in);
			System.out.println("Dime una frase puto");
		String frase = pregunta.next();
		
		
		//Mostramos la frase que nos ha mandado el usuari
	
		System.out.println("La frase que has escrito es : "+frase);
		
		
		
	}

}
