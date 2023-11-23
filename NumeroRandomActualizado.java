import java.util.Random;
import java.util.Scanner;

public class NumeroRandomActualizado {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Random num;
		num = new Random();
		int numRandom = 5 + num.nextInt(20);
		System.out.println (numRandom);
	}

}
