import java.util.Scanner;

class RecursividadC{
	public static void cocientesRecursividad(int num, int num2) {
		if(num > 0 && num%num2 == 0) {
			num = num%num2;
			System.out.println("El numero '" + num + "' es un cociente");
		}
		if(num > 0) {
			cocientesRecursividad(num/num2, num2);
		}
	}
}

public class Ejercicio03Cociente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int num2 = 0;
		
		do {
			System.out.println("Ingrese un número mayor a 0:");
			num = entrada.nextInt();
			if(num <= 0) {
				System.out.println("Unicamente numeros mayoeres a cero");
			}
		}while (num <= 0);
		
		do {
			System.out.println("Ingrese un segundo numero mayor a 1:");
			num2 = entrada.nextInt();
			if(num <= 1) {
				System.out.println("Unicamente numeros mayores a 1");
			}
		}while(num2 <= 1);
		
		RecursividadC.cocientesRecursividad(num, num2);

	}

}
