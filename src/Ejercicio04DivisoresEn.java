import java.util.Scanner;

class RecursividadD{
	
	public static void divisoresRecursivo(int num, int num2, int cont){
		if(num>0 && num2%num==0){
			cont++;
		}
		if(num>0){
			divisoresRecursivo(num-1, num2-1, cont);
		}
		if(num==0){
			System.out.println("Tiene: " + cont + " divisores");
		}
	}
}
public class Ejercicio04DivisoresEn {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num = 0;
		int num2 = 0;
		int cont = 0;
		
		do{
			System.out.println("Ingresa un numero mayor a 0: ");
			num = entrada.nextInt();
			if(num <= 0) {
				System.out.println("Unicamente numeros mayoeres a cero");
			}
		}while(num<=0);
		
		do {
			System.out.println("Ingrese un segundo numero mayor a 1:");
			num2 = entrada.nextInt();
			if(num <= 1) {
				System.out.println("Unicamente numeros mayores a 1");
			}
		}while(num2 <= 1);
		
		RecursividadD.divisoresRecursivo(num, num2, cont);

	}

}
