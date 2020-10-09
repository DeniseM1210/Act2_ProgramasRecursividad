import java.util.Scanner;

class RecursividadV{
	public static void vocalesRecursivas(int i, String cadena, String sub, int cont){
	
		if(i==cadena.length()){
			System.out.println("La cadena tiene " + cont + " vocales");
		}
		if(i<cadena.length()){
			sub = cadena.substring(i, i+1);
		}
		else if(i==cadena.length()){
			sub = cadena.substring(-1+i, i);
		}
		if(sub.equalsIgnoreCase("A") || sub.equalsIgnoreCase("E") || sub.equalsIgnoreCase("I") || sub.equalsIgnoreCase("O") || sub.equalsIgnoreCase("U")){
			cont++;
		}
		if(i<=cadena.length()){
			vocalesRecursivas(i+1, cadena, sub, cont);
		}
	}
}
public class Ejercicio06Vocales {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int cont = 0;
		String cadena = "";
		String sub = "";
		int i = 0;
		
		do{
			System.out.println("Ingrese palabra o frase: ");
			cadena = entrada.nextLine().toUpperCase();
			RecursividadV.vocalesRecursivas(i, cadena, sub, cont);
			cont = 1;
			
		}while(cont < 1);
	}

}
