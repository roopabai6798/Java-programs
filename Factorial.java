
public class Factorial {

	public static void main(String[] args) {
		int number=-1;
		int fact=1;
		if(number<0)
		{
			System.out.println("factorial does not exist");
		
		}
		else {
			for(int i=1;i<=number;i++)
			{
				fact = fact*i;
			}
			System.out.println(number+"!="+fact);
		}
		
		

	}

}
