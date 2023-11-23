import java.util.Scanner;

public class TablaMultiplicar {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int cont = 0;
		int num = 1;
		System.out.println("Introduce un número entre 1 y 10, por favor:");
		num = sc.nextInt();
		while (num <= 10 && num >= 1) {
			while (cont <= 10) {
				System.out.println(num*(cont++));
			}
		}
		
	}

}
