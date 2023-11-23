import java.util.Scanner;

public class CuentaAtrásWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cont;
		cont = 300;
		while (cont <= 300) {
			while(cont>180) {
				cont=cont-20;
				System.out.println(cont);
			}
		}
	}

}