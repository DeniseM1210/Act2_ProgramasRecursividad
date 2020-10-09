import java.util.Scanner;

class Recursividad{
	
	public static void divisoresRecursivo(int num, int num2) {
		if(num > 0 && num2 % num == 0) {
			System.out.println("El número '" + num + "' es divisor");
		}
		if(num > 0) {
			divisoresRecursivo(num-1, num2);
		}
	}
}

public class Ejercicio01Divisores {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int num2 = 0;
		
		do {
			System.out.println("Ingrese un número: ");
			num = entrada.nextInt();
			
		}while(num <= 0);
		num2 = num;
		Recursividad.divisoresRecursivo(num, num2);
	}

}
