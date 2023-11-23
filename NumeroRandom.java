import java.util.Random;
import java.util.Scanner;

public class NumeroRandom {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Random num;
		num = new Random();
		int numRandom = 5 + num.nextInt(10);
		System.out.println(numRandom);
	}

}
