import java.util.Scanner;

public class SumaDigitos {
	
	public static void main(String[] args) { 
		Scanner sn = new Scanner(System.in); 
		System.out.println("Introduce un numero:"); 
		int num = sn.nextInt(); 
		//Voy a ir sumando en un acumulador siempre el ultimo digito 
		//cada vez que sume el ulrimo digito lo elimino del numero 
		//1250 -> acumulador = acumulador + 0 
		//1250 -> acumulador = acumulador + 5 
		//1250 -> acumulador = acumulador + 2 
		//1250 -> acumulador = acumulador + 1 
		//0 Fin 
		int acumulador = 0; 
		while(num>0) { 
			acumulador = acumulador + (num%10); 
			num = num/10; 
		} 
		System.out.println("La suma de los dígitos es "+acumulador); 
	} 
} 