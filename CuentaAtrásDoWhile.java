import java.util.Scanner;

public class CuentaAtrásDoWhile {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int cont = 320;
		do {
			cont=cont-20;
			System.out.println(cont);
		}while (cont<=300 && cont>180);
	}
}
