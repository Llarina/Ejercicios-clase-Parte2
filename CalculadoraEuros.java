import java.util.Scanner; 

public class CalculadoraEuros { 

	public static void main(String[] args) { 
		// TODO Auto-generated method stub 
		Scanner ce = new Scanner(System.in); 
		System.out.println("Introduce una cantidad de pesetas:"); 
		double pe = ce.nextDouble();//Pido la cantidad en numero real, ya que al pedir dinero puede contener decimales 
		if (pe < 0) { 
			System.out.println("El valor de pesetas establecido no es correcto"); 
		} 
		else if (pe > 0) { 
			double euros = (pe/166.366); 
			System.out.printf("%.3f pesetas son %.3f euros",pe,euros); 
		} 
	} 
} 
