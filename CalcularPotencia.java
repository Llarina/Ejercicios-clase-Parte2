import java.util.Scanner;

public class CalcularPotencia {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce una base:");
		double base = sc.nextDouble();
		System.out.println("Introduce un exponente:");
		double pot = sc.nextDouble();
		int cont=0;
		double num=1;
		if (pot>0) {
			do {
				num=num*base;
				cont=cont+1;
			}while(cont<pot);
		System.out.println(num);
		}
		if(pot<0) {
			do {
				num=num*base;
				cont=cont-1;
			}while(cont>pot);
		num=1/num;
		System.out.println(num);
		}
		if (pot==0) {
			num=1;
			System.out.println(num);
		}
	}
}