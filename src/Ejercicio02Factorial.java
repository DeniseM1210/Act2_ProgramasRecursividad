import java.util.Scanner;

class RecursividadF{
	public static void factorialRecursivo(int num, int num2) {
		num2 = num2 * num;
		
		if(num > 1) {
			factorialRecursivo(num-1, num2);
		}
		else {
			System.out.println("El factorial es: " + num2);
		}
	}
}

public class Ejercicio02Factorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int num2 = 0;
		
		do {
			System.out.println("Ingrese el número: ");
			num = entrada.nextInt();
			num2 = num;
			if(num >= 20) {
				System.out.println("Unicamente números menores a 20!");
			}
		}while(num >= 20);
		
		RecursividadF.factorialRecursivo(num-1, num2);


	}

}
