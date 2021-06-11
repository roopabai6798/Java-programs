
public class SmallestOfThree {

	public static void main(String[] args) {
		int num1=50,num2=20,num3=10;
		if(num1<num2 && num1<num3)
			System.out.println(num1+ "Is smaller");			
		else if(num2<num1 && num2<num3)
			System.out.println(num2+"Is smaller");
		else
			System.out.println(num3+ "\tIs smaller");
	}

}
