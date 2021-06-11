import java.util.Scanner;
public class Arithmetic {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int x;	
		int y;	
		int sum;	
		int product;	
		int difference;	
		int quotient;
		System.out.print("Enter first integer: ");	
		x = input.nextInt();
		System.out.print("Enter second integer: ");	
		y = input.nextInt();	
		
		sum	= x + y;	
		product	= x * y;	
		difference = x - y;	
		quotient = x / y;	
		
		System.out.printf("Sum is %d\n", +sum);	
		System.out.printf("Product is %d\n", +product);	
		System.out.printf("Difference is %d\n", +difference);	
		System.out.printf("Quotient is %d\n", +quotient);	
	}

}
