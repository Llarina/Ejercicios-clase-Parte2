import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {

	public static void main(String[] args) {
		Random numS;
		numS = new Random();
		int numO = 1 + numS.nextInt(9);
		Scanner sc = new Scanner(System.in);
		int intentos = 5;
		while(intentos>0) {
			System.out.println(" introduce un numero:");
			int num = sc.nextInt();
			intentos--;
			if(num==numO){
				System.out.println("enhorabuena, el número correcto era: "+numO);
				break;
			}
			if (num!=numO) {
				if(intentos!=0) {
				System.out.println("Incorrecto, quedan "+intentos+" intentos");
				}
				if(intentos==0) {
					System.out.println("Se acabaron tus intentos, el numero correcto era: "+numO);
				}	
			}
		}
	}
}