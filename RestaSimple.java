import java.util.Scanner; 

public class RestaSimple { 

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		Scanner rs = new Scanner(System.in); 
		System.out.println("Introduce un numero entero, por favor:"); 
		int num1 = rs.nextInt();//Pido el primer numero 
		System.out.println("Introduce otro numero entero, por favor:");		 
		int num2 = rs.nextInt();//Pido el segundo numero 
		if (num1==num2){ 
			System.out.println("Los dos n�meros son iguales"); 
		}//A�ado el primer "Si" y le indico lo que deseo 
		else if (num1!=num2){ 
			if (num1<num2){  
				System.out.print(num2 -= num1); 
			}//Le indico el comando que debe realizar en caso de que se cumpla la condici�n 
			else if (num1>num2){ 
				System.out.print(num1 -= num2); 
			}//Le indico el comando que debe realizar en caso de que se cumpla la condici�n 
		}//a�ado un "SiNo Si" para la condici�n contraria y le indico lo que deseo
		rs.close();//Cierro el objeto "rs", por lo que no podr� utilizarlo m�s adelante 
		} 
	} 