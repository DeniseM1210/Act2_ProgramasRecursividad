import java.util.Scanner;

class RecursividadI{
	public static void cadenaInvertidaRec(String cadena, int x, String palabra){
		
		if(x>0) {
			palabra = palabra + cadena.substring(x-1, x);
			cadenaInvertidaRec(cadena, x-1, palabra);
		}else {
			System.out.println(palabra);
		}
	}
}
public class CadenaInversa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int x = 0;
		String cadena = "";
		String palabra = "";
		
		do {
			System.out.println("Ingrese la frase o palabra: ");
			cadena = entrada.nextLine();
			x = cadena.length();
			RecursividadI.cadenaInvertidaRec(cadena, x, palabra);
		}while(x <= 0);

	}

}
